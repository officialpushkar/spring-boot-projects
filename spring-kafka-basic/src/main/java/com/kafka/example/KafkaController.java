package com.kafka.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

	@Autowired
	private KafkaProducer kafkaProducer;

	@Autowired
	private KafkaJsonProducer kafkaJsonProducer;

	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("msg") String msg) {

		kafkaProducer.sendMsg(msg);
		return ResponseEntity.ok("Message Sent to Topic");

	}

	@GetMapping("/publishJson")
	public ResponseEntity<String> publish() {
		User user = new User();
		user.setId(1);
		user.setFirstName("Hey");
		user.setLastName("Bey");
		
		kafkaJsonProducer.sendMsg(user);
		return ResponseEntity.ok("Message Sent to Topic");

	}
}
