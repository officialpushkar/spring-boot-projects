package com.spring.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
	
	
	@JmsListener(destination = "external.queue")
	public void listener(String msg) {

		System.out.println("Received Message: " + msg);

	}

}
