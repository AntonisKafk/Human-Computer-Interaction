package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class Espresso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espresso);
        Button peru = findViewById(R.id.peru);
        Button arabica = findViewById(R.id.arabica);
        Button intenso = findViewById(R.id.intenso);
        Button single = findViewById(R.id.single);
        Button doubledose = findViewById(R.id.doubledose);
        peru.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(arabica.isPressed() || intenso.isPressed())
                    peru.setPressed(false);
                else
                    peru.setPressed(true);
                return true;
            }
        });
        arabica.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(peru.isPressed() || intenso.isPressed())
                    arabica.setPressed(false);
                else
                    arabica.setPressed(true);
                return true;
            }
        });
        intenso.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(peru.isPressed() || arabica.isPressed())
                    intenso.setPressed(false);
                else
                    intenso.setPressed(true);
                return true;
            }
        });
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