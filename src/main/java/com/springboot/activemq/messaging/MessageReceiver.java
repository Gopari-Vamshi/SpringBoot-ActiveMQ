package com.springboot.activemq.messaging;

import java.time.LocalTime;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

	
	@JmsListener(destination = "messaging.queue")
	public void receiveQueue(String text) {
		try {
			System.out.println(LocalTime.now());
			Thread.sleep(10000);
			System.out.println(LocalTime.now());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Message Received: " + text); 
		
	}
}
