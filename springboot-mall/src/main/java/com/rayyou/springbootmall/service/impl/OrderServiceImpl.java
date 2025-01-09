package com.rayyou.springbootmall.service.impl;

import com.rayyou.springbootmall.dao.OrderDao;
import com.rayyou.springbootmall.dao.ProductDao;
import com.rayyou.springbootmall.dto.BuyItem;
import com.rayyou.springbootmall.dto.CreateOrderRequest;
import com.rayyou.springbootmall.model.Order;
import com.rayyou.springbootmall.model.OrderItem;
import com.rayyou.springbootmall.model.Product;
import com.rayyou.springbootmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @Override
    public Order getOrderById(Integer orderId) {
        Order order = orderDao.getOrderById(orderId);

        List<OrderItem> orderItemList = orderDao.getOrderItemsByOrderId(orderId);

        order.setOrderItemList(orderItemList);
        return order;
    }

    @Transactional
    @Override
    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest) {
        int totalAmout = 0;
        List<OrderItem> orderItemList = new ArrayList<>();

        // 計算訂單金額
        for (BuyItem buyItem : createOrderRequest.getBuyItemList()){
        Product product = productDao.getProductById(buyItem.getProductId());

        int amount = buyItem.getQuantity() * product.getPrice();
        totalAmout = totalAmout + amount;


        // 轉換 BuyItem to OrderItem
        OrderItem orderItem = new OrderItem();
        orderItem.setProductId(buyItem.getProductId());
        orderItem.setQuantity(buyItem.getQuantity());
        orderItem.setAmount(amount);

        orderItemList.add(orderItem);
        }

        // 創建訂單
        Integer orderId = orderDao.createOrder(userId,totalAmout);

        orderDao.createOrderItems(orderId, orderItemList);
        return orderId;
    }
}
