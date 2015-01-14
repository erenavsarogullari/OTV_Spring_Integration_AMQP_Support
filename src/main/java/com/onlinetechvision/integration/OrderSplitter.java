package com.onlinetechvision.integration;

import java.util.List;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.onlinetechvision.model.Order;

/**
 * Order Splitter breaks incoming Order List into Order message(s) 
 * and send them to the output channel.
 * 
 * @author Eren Avsarogullari
 * @since 15 Jan 2015
 * @version 1.0.0
 *
 */
@Component("orderSplitter")
public class OrderSplitter {

    /**
     * Splits Order List to Order request(s)
     *
     * @param message SI Message covering Order List payload.
     * @return order list
     */
    public List<Order> splitOrderList(Message<List<Order>> message) {
        return message.getPayload();
    }
}
