package com.example.lesson_03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    private Counter counter;
    private TextView textViewCounter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        textViewCounter = findViewById(R.id.text_counter);

        if (savedInstanceState != null) {
            counter = savedInstanceState.getParcelable("counter");

            Log.d("MainCounter", "onCreate recreate");

        } else {

            counter = new Counter();

            Log.d("MainCounter", "onCreate create first time!");
        }

        showResult();

        findViewById(R.id.button_increase).setOnClickListener(view -> {
            counter.increase();

            showResult();
        });

    }

    // Вызывается только если есть ИЗМЕНЕНИЯ
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        Log.d("MainCounter", "onRestoreInstanceState");

        counter = savedInstanceState.getParcelable("counter");

        showResult();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putParcelable("counter", counter);
        super.onSaveInstanceState(outState);

        Log.d("MainCounter", "onSaveInstanceState");
    }

    private void showResult() {
        textViewCounter.setText(String.valueOf(counter.getValue()));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainCOUNTER", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainCOUNTER", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainCOUNTER", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainCOUNTER", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainCOUNTER", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainCOUNTER", "onDestroy");
    }
}