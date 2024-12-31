package com.example.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.service.KafkaService;

@RestController
@RequestMapping("/api")
public class KafkaController {

	@Autowired
	private KafkaService kafkaService;

	@PostMapping("/send-msg")
	public ResponseEntity<?> sendMsg(@RequestBody String msg) {
//		Integer count = 0;
//		for (int i = 0; i < 100; i++) {
			kafkaService.sendMsg( msg);
//			count++;
//		}
		
		
		return new ResponseEntity<String>("msg sent...", HttpStatus.OK);

	}

}
