package com.upitranzact.upitranzactandroidsdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.upitranzact.upitranzact.CheckoutActivity;
import com.upitranzact.upitranzact.UpiTranzactSDK;
import com.upitranzact.upitranzact.network.PaymentCallback;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    Button payButton;
    EditText amountEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.gray));

        payButton = findViewById(R.id.payButton);
        amountEditText = findViewById(R.id.amountEditText);

        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (amountEditText.getText().toString().isEmpty() || amountEditText.getText().toString().equals("0")) {
                    Toast.makeText(MainActivity.this, "Please enter a valid amount!!", Toast.LENGTH_SHORT).show();
                    return;
                }

                UpiTranzactSDK sdk = new UpiTranzactSDK(MainActivity.this, "utz_live_fef691dc36dd3f68", "c34fa342601a163d4acaamn", "UPITRANS");
                sdk.startPayment(
                        amountEditText.getText().toString(), // Amount
                        generateOrderId(),
                        "https://upitranzact.com",
                        "Ritik Raj",
                        "rritik866@gmail.com",
                        "8294106141",
                        new PaymentCallback() {
                            @Override
                            public void onPaymentSuccess(String order_id, String message) {
                                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
//                                Intent intent = new Intent(MainActivity.this, SuccessActivity.class);
//                                intent.putExtra("orderId", order_id);
//                                startActivity(intent);
                            }

                            @Override
                            public void onPaymentFailed(String order_id, String message) {
                                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
//                                Intent intent = new Intent(MainActivity.this, FailActivity.class);
//                                intent.putExtra("orderId", order_id);
//                                startActivity(intent);
                            }
                        }
                );
            }
        });
    }

    public String generateOrderId() {
        long timestamp = System.currentTimeMillis();
        String uniqueId = UUID.randomUUID().toString().replace("-", "").substring(0, 8); // 8-character unique string
        return "ORDER_" + timestamp + "_" + uniqueId;
    }
}