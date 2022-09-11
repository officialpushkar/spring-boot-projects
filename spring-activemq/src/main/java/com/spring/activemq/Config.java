package com.spring.activemq;

import javax.jms.Queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@EnableJms
@Configuration
public class Config {

    @Value("{activemq.broker.url}")
    private String brokerURL;

    @Bean
    public Queue queue() {

        return new ActiveMQQueue("external.queue");
    }

    @Bean
    public ActiveMQConnectionFactory factory() {

        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
        //factory.setBrokerURL(this.brokerURL);
        return factory;
    }

}
