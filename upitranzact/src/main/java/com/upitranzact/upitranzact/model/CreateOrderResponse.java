package com.upitranzact.upitranzact.model;

public class CreateOrderResponse {

    private boolean status;            // Whether the request was successful
    private int statusCode;            // HTTP status code (200, 400, etc.)
    private String msg;                // Message related to the request status
    private CreateOrderData data;      // Contains additional data like order ID and payment URL

    // Constructor
    public CreateOrderResponse(boolean status, int statusCode, String msg, CreateOrderData data) {
        this.status = status;
        this.statusCode = statusCode;
        this.msg = msg;
        this.data = data;
    }

    // Getters and Setters
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public CreateOrderData getData() {
        return data;
    }

    public void setData(CreateOrderData data) {
        this.data = data;
    }
}
