package com.kafka.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonConsumer {

	private static Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(topics = "topic-demo2", groupId = "myGroup")
	public void consume(User user) {

		LOGGER.info(String.format("Message Received -> %s", user.toString()));

	}

}
