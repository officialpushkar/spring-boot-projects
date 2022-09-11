package com.kafka.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	private static Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(topics = "topic-demo", groupId = "myGroup")
	public void consume(String msg) {

		LOGGER.info(String.format("Message Received -> %s", msg));

	}

}
