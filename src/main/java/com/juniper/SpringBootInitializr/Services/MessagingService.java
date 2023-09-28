package com.juniper.SpringBootInitializr.Services;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;

import org.slf4j.Logger;

@Service
public class MessagingService  {
    // private static final Logger LOGGER = LoggerFactory.getLogger(MessagingService.class);
    // private static final String QUEUE_NAME = "myservicebusqueue";

    // @Autowired
    // private JmsTemplate jmsTemplate;

    // public void sendMessage(String message) {
    //     LOGGER.info("Sending message" + message);
    //     jmsTemplate.convertAndSend(QUEUE_NAME, message);
    // }

    // @JmsListener(destination = QUEUE_NAME, containerFactory = "jmsListenerContainerFactory")
    // public void receiveMessage(String message) {
    //     LOGGER.info("Message received: {}", message);
    // }
}