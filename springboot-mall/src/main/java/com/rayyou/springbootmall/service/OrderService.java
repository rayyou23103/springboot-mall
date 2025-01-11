package com.rayyou.springbootmall.service;

import com.rayyou.springbootmall.dto.CreateOrderRequest;
import com.rayyou.springbootmall.dto.OrderQueryParams;
import com.rayyou.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);



}
