package com.example.lesson_03;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        Log.d("MainAct2", "onCreate");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainAct2", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainAct2", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainAct2", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainAct2", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainAct2", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainAct2", "onDestroy");
    }



}
