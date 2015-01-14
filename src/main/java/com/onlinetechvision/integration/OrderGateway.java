package com.onlinetechvision.integration;

import java.util.List;

import org.springframework.messaging.Message;

import com.onlinetechvision.model.Order;

/**
 * Cargo Gateway Interface exposes domain-specific method to the application. In
 * other words, it provides an application access to the messaging system.
 * 
 * @author Eren Avsarogullari
 * @since 15 Jan 2015
 * @version 1.0.0
 */
public interface OrderGateway {

	/**
     * Processes Order Request
     *
     * @param message SI Message covering Order payload.
     */
	void processOrderRequest(Message<List<Order>> message);
}
