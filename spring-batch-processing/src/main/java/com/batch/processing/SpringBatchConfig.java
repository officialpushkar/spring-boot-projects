package com.batch.processing;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.partition.PartitionHandler;
import org.springframework.batch.core.partition.support.TaskExecutorPartitionHandler;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import lombok.AllArgsConstructor;

@Configuration
@EnableBatchProcessing
//@AllArgsConstructor
public class SpringBatchConfig {
	
	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerWriter customerWriter;

	 @Bean
	    public FlatFileItemReader<Customer> reader() {
	        FlatFileItemReader<Customer> itemReader = new FlatFileItemReader<>();
	        itemReader.setResource(new FileSystemResource("src/main/resources/customers.csv"));
	        itemReader.setName("csvReader");
	        itemReader.setLinesToSkip(1);
	        itemReader.setLineMapper(lineMapper());
	        return itemReader;
	    }

	    private LineMapper<Customer> lineMapper() {
	        DefaultLineMapper<Customer> lineMapper = new DefaultLineMapper<>();

	        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
	        lineTokenizer.setDelimiter(",");
	        lineTokenizer.setStrict(false);
	        lineTokenizer.setNames("id", "firstName", "lastName", "email", "gender", "contactNo", "country", "dob");

	        BeanWrapperFieldSetMapper<Customer> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
	        fieldSetMapper.setTargetType(Customer.class);

	        lineMapper.setLineTokenizer(lineTokenizer);
	        lineMapper.setFieldSetMapper(fieldSetMapper);
	        return lineMapper;

	    }

	    @Bean
	    public CustomerProcessor processor() {
	        return new CustomerProcessor();
	    }

		/*
		 * @Bean public RepositoryItemWriter<Customer> writer() {
		 * RepositoryItemWriter<Customer> writer = new RepositoryItemWriter<>();
		 * writer.setRepository(customerRepository); writer.setMethodName("save");
		 * return writer; }
		 */

	    @Bean
	    public ColumnRangePartitioner partitioner() {
	    	return new ColumnRangePartitioner();
	    }
	    
	    @Bean
	    public PartitionHandler handler() {
	    	TaskExecutorPartitionHandler partitionHandler = new TaskExecutorPartitionHandler();
	    	partitionHandler.setGridSize(2);
	    	partitionHandler.setTaskExecutor(taskExecutor());
	    	partitionHandler.setStep(slaveStep());
	    	return partitionHandler;
	    }
	    
	    @Bean
	    public Step slaveStep() {
	        return stepBuilderFactory.get("slave-step").<Customer, Customer>chunk(500)
	                .reader(reader())
	                .processor(processor())
	                .writer(customerWriter)
	                //.taskExecutor(taskExecutor())
	                .build();
	    }
	    
	    @Bean
	    public Step masterStep() {
	        return stepBuilderFactory.get("master-step")
	        		.partitioner(slaveStep().getName(), partitioner())
	        		.partitionHandler(handler())
	                .build();
	    }

	    @Bean
	    public Job runJob() {
	        return jobBuilderFactory.get("importCustomers")
	                .flow(masterStep()).end().build();

	    }
	    
	    public TaskExecutor taskExecutor() {
	    	//SimpleAsyncTaskExecutor  executor = new SimpleAsyncTaskExecutor();
	    	//executor.setConcurrencyLimit(10);
	    	ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	    	executor.setMaxPoolSize(4);
	    	executor.setCorePoolSize(4);
	    	executor.setQueueCapacity(4);
	    	executor.initialize();
	    	return executor;
	    }

}
