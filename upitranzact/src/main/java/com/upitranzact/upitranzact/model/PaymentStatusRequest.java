package com.upitranzact.upitranzact.model;

public class PaymentStatusRequest {

    private String mid;        // Merchant ID
    private String order_id;   // Unique order ID

    // Constructor
    public PaymentStatusRequest() {
    }

    // Getters and Setters
    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
}
