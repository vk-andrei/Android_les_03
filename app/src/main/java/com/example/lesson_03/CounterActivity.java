package com.example.lesson_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    private int counter = 0;
    private TextView textViewCounter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        textViewCounter = findViewById(R.id.text_counter);

        showResult();

        findViewById(R.id.button_increase).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;

                showResult();
            }
        });
    }

    private void showResult() {
        textViewCounter.setText(String.valueOf(counter));
    }
}