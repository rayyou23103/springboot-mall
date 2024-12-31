package com.rayyou.springbootmall.service;

import com.rayyou.springbootmall.dto.ProductRequest;
import com.rayyou.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
}
