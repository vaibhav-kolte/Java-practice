package com.myproject.senderapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.myproject.senderapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    String ACTION_SEND_MESSAGE = "com.myproject.reciverapp.ACTION_SEND_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.sendMessageButton.setOnClickListener(v -> sendMessageToAppA());
    }

    private void sendMessageToAppA() {
        try {
            String message = binding.etMessage.getText().toString();
            if (message.isEmpty()) {
                Snackbar.make(binding.main, "Enter message", Snackbar.LENGTH_SHORT)
                        .show();
                return;
            }
            Intent intent = new Intent(ACTION_SEND_MESSAGE);

            intent.putExtra(Intent.EXTRA_TEXT, message);

            intent.setType("text/plain");

            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Snackbar.make(binding.main, "Activity Not found", Snackbar.LENGTH_SHORT)
                    .show();
        }
    }
}