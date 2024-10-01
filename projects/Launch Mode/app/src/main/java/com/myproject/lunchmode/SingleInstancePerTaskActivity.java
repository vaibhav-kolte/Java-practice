package com.myproject.lunchmode;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.myproject.lunchmode.databinding.ActivitySingleInstancePerTaskBinding;

public class SingleInstancePerTaskActivity extends AppCompatActivity {
    private static final String TAG = "SingleInstancePerTaskAc";
    private ActivitySingleInstancePerTaskBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySingleInstancePerTaskBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        handleOnClick();
        ActivityStack.getInstance().push(TAG);
        ActivityStackHelper.printActivityStack(this);
    }

    private void handleOnClick() {
        binding.btnStandardActivity.setOnClickListener(view -> {
            startActivity(new Intent(this, StandardActivity.class));
        });

        binding.btnSingletopActivity.setOnClickListener(view -> {
            startActivity(new Intent(this, SingleTopActivity.class));
        });

        binding.btnSingletaskActivity.setOnClickListener(view -> {
            startActivity(new Intent(this, SingleTaskActivity.class));
        });

        binding.btnSingleInstanceActivity.setOnClickListener(view -> {
            startActivity(new Intent(this, SingleInstanceActivity.class));
        });

        binding.btnSingleInstancePerTaskActivity.setOnClickListener(view -> {
            startActivity(new Intent(this, SingleInstancePerTaskActivity.class));
        });
    }

    @Override
    protected void onNewIntent(@NonNull Intent intent) {
        super.onNewIntent(intent);
        Log.d("ActivityStack", "onNewIntent: " + TAG);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityStack.getInstance().pop();
        ActivityStackHelper.printActivityStack(this);
    }
}