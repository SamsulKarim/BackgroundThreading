package com.example.backgroundthreading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonStart,buttonStop, buttonTaskA, buttonTaskB;
    private static final String TAG = "MainActivity";
    private ExampleLooperThread looperThread = new ExampleLooperThread();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();

    }


    private void initialize(){

        buttonStart = findViewById(R.id.button_start);
        buttonStop = findViewById(R.id.button_stop);
        buttonTaskA = findViewById(R.id.button_task_a);
        buttonTaskB = findViewById(R.id.button_task_b);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
        buttonTaskA.setOnClickListener(this);
        buttonTaskB.setOnClickListener(this);

    }

    private void startThread(){
        looperThread.start();
    }

    private void stopThread(){

    }

    private void taskA(){

    }

    private void taskB(){

    }


    @Override
    public void onClick(View view) {

        if (view == buttonStart){
            startThread();
        }else if (view == buttonStop){
            stopThread();
        }
        else if (view == buttonTaskA){
            taskA();
        }
        else if(view == buttonTaskB){
            taskB();
        }
    }
}