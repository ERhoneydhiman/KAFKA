package com.example.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public Boolean sendMsg(String msg) {
		kafkaTemplate.send("dantu", msg);
		return true;

	}

}
