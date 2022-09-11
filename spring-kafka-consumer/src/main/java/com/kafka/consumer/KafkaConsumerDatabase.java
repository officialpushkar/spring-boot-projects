package com.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerDatabase {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerDatabase.class);

	@KafkaListener(topics = "wiki-recentchange", groupId = "myGroup")
	public void consume(String event) {

		LOGGER.info(String.format("Event Message Received -> %s", event));

	}

}
