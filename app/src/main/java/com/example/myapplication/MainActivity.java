package com.example.myapplication;

import static com.example.myapplication.R.layout.activity_main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main); // assuming your layout file is named activity_main
    }
}
