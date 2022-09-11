package com.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.MessageEvent;

public class WikiChangeHandler implements EventHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(WikiChangeHandler.class);

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	private String topic;

	public WikiChangeHandler(String topic) {
		this.topic = topic;
	}
 
	@Override
	public void onClosed() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void onComment(String arg0) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void onError(Throwable arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onMessage(String arg0, MessageEvent event) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info(String.format("Event Data -> %s", event.getData()));
		kafkaTemplate.send(topic,event.getData());
	}

	@Override
	public void onOpen() throws Exception {
		// TODO Auto-generated method stub

	}

}
