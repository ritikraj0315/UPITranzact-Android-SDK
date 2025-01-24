package com.upitranzact.upitranzact.model;

public class CreateOrderData {

    private String orderId;           // Unique order ID created by the server
    private String payment_url;       // Payment URL to redirect the user

    // Constructor
    public CreateOrderData(String orderId, String payment_url) {
        this.orderId = orderId;
        this.payment_url = payment_url;
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPayment_url() {
        return payment_url;
    }

    public void setPayment_url(String payment_url) {
        this.payment_url = payment_url;
    }
}

