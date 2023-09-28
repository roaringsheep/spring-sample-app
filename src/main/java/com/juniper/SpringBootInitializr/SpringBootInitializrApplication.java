package com.juniper.SpringBootInitializr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.domain.EntityScan;
// import org.springframework.jms.annotation.EnableJms;
// import org.springframework.jms.annotation.JmsListener;
// import org.springframework.jms.core.JmsTemplate;


@SpringBootApplication
// @EnableJms
// @EntityScan("com.juniper.SpringBootInitializr.Models")
public class SpringBootInitializrApplication {
	// @Autowired
	// private JmsTemplate jmsTemplate;
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootInitializrApplication.class);

	// private static final String QUEUE_NAME = "busqueue";
	public static void main(String[] args) {
		SpringApplication.run(SpringBootInitializrApplication.class, args);
	}

	public void run(String... args) throws Exception {
		// jmsTemplate.convertAndSend(QUEUE_NAME, "Hello World");
	}



    // public void sendMessage(String message) {
    //     jmsTemplate.convertAndSend(QUEUE_NAME, message);
    // }

    // @JmsListener(destination = QUEUE_NAME, containerFactory = "jmsListenerContainerFactory")
    // public void receiveMessage(String message) {
    //     LOGGER.info("Azure Service Bus Message received: {}", message);
    // }
}
