package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    public void showCoffeeMenu(View view) {
        Intent intent = new Intent(this, Coffee_Menu.class);
        startActivity(intent);
    }

    public void showChocoMenu(View view) {
        Intent intent = new Intent(this, Choco_Menu.class);
        startActivity(intent);
    }
}