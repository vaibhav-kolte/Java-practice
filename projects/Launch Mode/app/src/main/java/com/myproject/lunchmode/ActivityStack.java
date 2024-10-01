package com.myproject.lunchmode;

import android.util.Log;

import java.util.Stack;

public class ActivityStack {
    private static final String TAG = "ActivityStack";

    private final Stack<String> activityStack;
    private static ActivityStack instance = null;

    private ActivityStack() {
        this.activityStack = new Stack<>();

    }

    public static ActivityStack getInstance() {
        if (instance == null) {
            instance = new ActivityStack();
            return instance;
        }
        return instance;
    }

    public void push(String activityName) {
        activityStack.push(activityName);
        Log.d(TAG, "push: " + activityName);
    }

    public void pop() {
        String pop = activityStack.pop();
        Log.d(TAG, "pop: " + pop);
    }

    public void printStack() {
        Log.d(TAG, "Printing activity stack.");
        for (String s : activityStack) {
            Log.d(TAG, "printStack: " + s);
        }
    }
}
