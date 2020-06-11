package com.springboot.activemq.messaging;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer implements CommandLineRunner {

	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	@Autowired
	private Queue queue;
	
	@Override
	public void run(String... args) throws Exception {
		
		this.jmsMessagingTemplate.convertAndSend(this.queue, "Hello! This is vamshi");
		System.out.println("Message has been put to queue by sender");
	}

}
