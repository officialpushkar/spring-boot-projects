package com.kafka.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonProducer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

	private KafkaTemplate<String, User> kafkaTemplate;

	public KafkaJsonProducer(KafkaTemplate<String, User> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendMsg(User user) {

		Message<User> msg = MessageBuilder.withPayload(user).setHeader(KafkaHeaders.TOPIC, "topic-demo2").build();
		kafkaTemplate.send(msg);
		LOGGER.info(String.format("Message Sent %s", user.toString()));
	}

}
