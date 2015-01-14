package com.onlinetechvision.process.service;

import org.springframework.messaging.Message;

/**
 * Generic Process Service Interface exposes process service funtionality.
 * 
 * @author Eren Avsarogullari
 * @since 15 Jan 2015
 * @version 1.0.0
 *
 */
public interface ProcessService<T> {

	/**
     * Processes incoming message(s)
     *
     * @param message SI Message.
     */
	void process(Message<T> message);
	
}
