package com.rayyou.springbootmall.service;

import com.rayyou.springbootmall.dto.CreateOrderRequest;
import com.rayyou.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
