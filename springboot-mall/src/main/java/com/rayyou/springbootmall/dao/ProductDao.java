package com.rayyou.springbootmall.dao;

import com.rayyou.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
