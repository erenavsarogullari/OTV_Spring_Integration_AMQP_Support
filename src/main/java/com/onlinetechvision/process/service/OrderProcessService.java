package com.onlinetechvision.process.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.onlinetechvision.model.Order;

/**
 * Order Process Service Implementation
 * 
 * @author Eren Avsarogullari
 * @since 15 Jan 2015
 * @version 1.0.0
 *
 */
@Component("orderProcessService")
public class OrderProcessService implements ProcessService<Order> {
	
	private final Logger logger = LoggerFactory.getLogger(OrderProcessService.class);
	private final static long SLEEP_DURATION = 1_000;
	
	@Override
	public void process(Message<Order> message) {
		try {
			Thread.sleep(SLEEP_DURATION);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		logger.debug("Node 1 - Received Message : " + message.getPayload());
	}
	
}
