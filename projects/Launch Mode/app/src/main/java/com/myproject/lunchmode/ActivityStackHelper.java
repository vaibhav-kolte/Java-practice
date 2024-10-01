package com.myproject.lunchmode;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import java.util.List;

public class ActivityStackHelper {

    public static void printActivityStack(@NonNull Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);

        // Get the list of tasks (each task contains a stack of activities)
        List<ActivityManager.RunningTaskInfo> taskInfoList = activityManager.getRunningTasks(10);  // 10 is the max number of tasks to retrieve

        // Loop through tasks and print the top activities
        for (ActivityManager.RunningTaskInfo taskInfo : taskInfoList) {
            Log.d("ActivityStack", "Task ID: " + taskInfo.id);
            Log.d("ActivityStack", "Number of activities: " + taskInfo.numActivities);
            assert taskInfo.topActivity != null;
            Log.d("ActivityStack", "Top Activity: " + taskInfo.topActivity.getClassName());
            assert taskInfo.baseActivity != null;
            Log.d("ActivityStack", "Base Activity: " + taskInfo.baseActivity.getClassName());
        }
    }
}
