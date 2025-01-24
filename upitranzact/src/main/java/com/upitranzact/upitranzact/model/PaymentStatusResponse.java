package com.upitranzact.upitranzact.model;

public class PaymentStatusResponse {

    private boolean status;             // Whether the payment status check was successful
    private int statusCode;             // HTTP status code (200, 400, etc.)
    private String msg;                 // Message related to the payment status
    private PaymentStatusData data;     // Contains additional data like UTR and amount

    // Constructor
    public PaymentStatusResponse(boolean status, int statusCode, String msg, PaymentStatusData data) {
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

    public PaymentStatusData getData() {
        return data;
    }

    public void setData(PaymentStatusData data) {
        this.data = data;
    }
}
