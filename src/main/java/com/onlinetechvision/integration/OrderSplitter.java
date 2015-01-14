package com.onlinetechvision.integration;

import java.util.List;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.onlinetechvision.model.Order;


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
