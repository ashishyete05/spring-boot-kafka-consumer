package com.example.demo.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;

@Service
public class KafkaConsumerListenerService {
	
	@Autowired
	UserRepository repo;

	@KafkaListener(topics = "test_topicWXYZ")
	public void consumeMsg(User user) {
		System.out.println("Message Recieved :- " + user.toString());
		repo.save(user);
	}

}
