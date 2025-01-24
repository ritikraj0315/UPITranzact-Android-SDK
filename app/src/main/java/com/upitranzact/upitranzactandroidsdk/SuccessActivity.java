package com.upitranzact.upitranzactandroidsdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        Intent intent = getIntent();
        String order_id = intent.getStringExtra("orderId");
        TextView orderId = findViewById(R.id.orderId);
        orderId.setText("OrderId: " + order_id);
        Button homeButton = findViewById(R.id.homeButton);

        homeButton.setOnClickListener(v -> finish());
    }
}