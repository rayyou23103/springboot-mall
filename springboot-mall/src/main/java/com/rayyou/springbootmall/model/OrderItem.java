package com.rayyou.springbootmall.model;

public class OrderItem {

    private Integer oderItemId;
    private Integer orderId;
    private Integer productId;
    private Integer quantity;
    private Integer amount;

    public Integer getOderItemId() {
        return oderItemId;
    }

    public void setOderItemId(Integer oderItemId) {
        this.oderItemId = oderItemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
