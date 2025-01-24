package com.upitranzact.upitranzact.model;

public class PaymentStatusData {

    private int amount;           // Amount paid
    private String UTR;          // Unique Transaction Reference (UTR)
    private String order_id;     // Order ID

    // Constructor
    public PaymentStatusData(int amount, String UTR, String order_id) {
        this.amount = amount;
        this.UTR = UTR;
        this.order_id = order_id;
    }

    // Getters and Setters
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUTR() {
        return UTR;
    }

    public void setUTR(String UTR) {
        this.UTR = UTR;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
}

