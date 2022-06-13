package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class Americano extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_americano);
        Button single = findViewById(R.id.single);
        Button doubledose = findViewById(R.id.doubledose);
        single.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(doubledose.isPressed())
                    single.setPressed(false);
                else
                    single.setPressed(true);
                return true;
            }
        });
        doubledose.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(single.isPressed())
                    doubledose.setPressed(false);
                else
                    doubledose.setPressed(true);
                return true;
            }
        });
    }
    public void showLoading(View view) {
        Intent intent = new Intent(this, Loading.class);
        startActivity(intent);
    }
}