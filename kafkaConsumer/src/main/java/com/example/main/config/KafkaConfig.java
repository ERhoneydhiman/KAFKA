package com.example.main.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
	
	@KafkaListener(topics = "dantu", groupId = "group-1")
	public void getMag(String msg) {
		System.out.println(msg);
	}

}
