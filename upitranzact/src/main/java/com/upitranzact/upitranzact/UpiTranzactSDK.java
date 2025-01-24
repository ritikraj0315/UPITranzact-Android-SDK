package com.upitranzact.upitranzact;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.upitranzact.upitranzact.model.PaymentStatusData;
import com.upitranzact.upitranzact.network.PaymentCallback;
import com.upitranzact.upitranzact.network.VolleySingleton;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class UpiTranzactSDK {
    private static PaymentCallback paymentCallback;
    private final Context context;
    private final String publicKey;
    private final String secretKey;
    private final String mid;

    public UpiTranzactSDK(Context context, String publicKey, String secretKey, String mid) {
        this.context = context;
        this.publicKey = publicKey;
        this.secretKey = secretKey;
        this.mid = mid;
    }

    public void startPayment(String amount, String orderId, String redirectUrl, String customerName, String customerEmail, String customerMobile, final PaymentCallback callback) {
        setPaymentCallback(callback);
        if (isNullOrEmpty(publicKey) || isNullOrEmpty(secretKey) || isNullOrEmpty(mid) || isNullOrEmpty(amount) || isNullOrEmpty(orderId) || isNullOrEmpty(redirectUrl) || isNullOrEmpty(customerName) || isNullOrEmpty(customerEmail) || isNullOrEmpty(customerMobile)) {

            if (callback != null) {
                callback.onPaymentFailed(orderId,"One or more required parameters are null or empty.");
            }
            return;
        }

        Intent intent = new Intent(context, CheckoutActivity.class);
        intent.putExtra("publicKey", publicKey);
        intent.putExtra("secretKey", secretKey);
        intent.putExtra("mid", mid);
        intent.putExtra("amount", amount);
        intent.putExtra("orderId", orderId);
        intent.putExtra("redirectUrl", redirectUrl);
        intent.putExtra("customerName", customerName);
        intent.putExtra("customerEmail", customerEmail);
        intent.putExtra("customerMobile", customerMobile);

        context.startActivity(intent);

        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        }
    }

    public static void setPaymentCallback(PaymentCallback callback) {
        paymentCallback = callback;
    }

    public static PaymentCallback getPaymentCallback() {
        return paymentCallback;
    }
    private boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

}
