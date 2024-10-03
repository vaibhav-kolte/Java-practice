package com.myproject.reciverapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class ReceiveMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intent = getIntent();
        if (intent != null &&
                Objects.equals(intent.getAction(), "com.myproject.reciverapp.ACTION_SEND_MESSAGE")) {
            String message = intent.getStringExtra(Intent.EXTRA_TEXT);

            TextView messageView = findViewById(R.id.message_view);
            messageView.setText("Received message: " + message);
        }
    }
}