package com.upitranzact.upitranzact.model;

public class OrderRequest {

    private String mid;                    // Merchant ID
    private String amount;                 // Payment amount (e.g., "200")
    private String order_id;               // Unique order ID (optional)
    private String redirect_url;           // URL to redirect after payment (success)
    private String note;                   // Note for payment (e.g., "Add money")
    private String customer_name;          // Customer's name
    private String customer_email;         // Customer's email
    private String customer_mobile;        // Customer's mobile number

    // Constructor
    public OrderRequest() {

    }

    // Getters and Setters
    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getRedirect_url() {
        return redirect_url;
    }

    public void setRedirect_url(String redirect_url) {
        this.redirect_url = redirect_url;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_mobile() {
        return customer_mobile;
    }

    public void setCustomer_mobile(String customer_mobile) {
        this.customer_mobile = customer_mobile;
    }
}


