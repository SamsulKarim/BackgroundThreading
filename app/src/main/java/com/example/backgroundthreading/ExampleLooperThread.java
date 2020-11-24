package com.example.backgroundthreading;

import android.nfc.Tag;
import android.os.SystemClock;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class ExampleLooperThread extends Thread {

    private static final String TAG = "ExampleLooperThread";

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            Log.d(TAG,"run"+ i);
            SystemClock.sleep(1000);

        }
        Log.d(TAG,"End of run()");
    }
}
