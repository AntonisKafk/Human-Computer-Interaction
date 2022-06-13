package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Choco_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choco_menu);
    }
    public void showChoco(View view) {
        Intent intent = new Intent(this, Chocolate.class);
        startActivity(intent);
    }
    public void showStrawberry(View view) {
        Intent intent = new Intent(this, Strawberry.class);
        startActivity(intent);
    }
    public void showAppleVanilla(View view) {
        Intent intent = new Intent(this, Apple_Vanilla.class);
        startActivity(intent);
    }
    public void showCaramelCookie(View view) {
        Intent intent = new Intent(this, Caramel_Cookie.class);
        startActivity(intent);
    }
    public void showCinnamonCandy(View view) {
        Intent intent = new Intent(this, CinnamonCandy.class);
        startActivity(intent);
    }
    public void showCaramelPeanut(View view) {
        Intent intent = new Intent(this, CaramelPeanut.class);
        startActivity(intent);
    }
    public void showAlmondVanilla(View view) {
        Intent intent = new Intent(this, AlmondVanilla.class);
        startActivity(intent);
    }
}