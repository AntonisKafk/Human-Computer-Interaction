package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Coffee_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_menu);
    }

    public void showFreddoEspresso(View view) {
        Intent intent = new Intent(this, Freddo_Espresso.class);
        startActivity(intent);
    }
    public void showFreddoCappuccino(View view) {
        Intent intent = new Intent(this, Freddo_Cappuccino.class);
        startActivity(intent);
    }
    public void showMochaccino(View view) {
        Intent intent = new Intent(this, Mochachino.class);
        startActivity(intent);
    }
    public void showEspresso(View view) {
        Intent intent = new Intent(this, Espresso.class);
        startActivity(intent);
    }
    public void showAmericano(View view) {
        Intent intent = new Intent(this, Americano.class);
        startActivity(intent);
    }
    public void showLatte(View view) {
        Intent intent = new Intent(this, Latte.class);
        startActivity(intent);
    }
    public void showNescaffe(View view) {
        Intent intent = new Intent(this, Nescaffe.class);
        startActivity(intent);
    }
    public void showCappuccino(View view) {
        Intent intent = new Intent(this, Cappuccino.class);
        startActivity(intent);
    }
}