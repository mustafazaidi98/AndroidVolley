package com.allemustafa.androidvolleyfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String  weatherApi = "https://api.openweathermap.org/data/2.5/weather";
    private static final String  weatherIconApi = "https://api.openweathermap.org/img/w";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}