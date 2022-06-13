package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class Apple_Vanilla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple_vanilla);
        Button cold = findViewById(R.id.cold);
        Button hot = findViewById(R.id.hot);
        cold.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(hot.isPressed())
                    cold.setPressed(false);
                else
                    cold.setPressed(true);
                return true;
            }
        });
        hot.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(cold.isPressed())
                    hot.setPressed(false);
                else
                    hot.setPressed(true);
                return true;
            }
        });
    }
    public void showLoading(View view) {
        Intent intent = new Intent(this, Loading.class);
        startActivity(intent);
    }
}