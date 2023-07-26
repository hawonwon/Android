package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1 (View v){
        Toast.makeText(getApplicationContext(), "Hello world 1", Toast.LENGTH_LONG).show();
    }

    public void button2 (View v){
        Toast.makeText(getApplicationContext(), "Hello world 2", Toast.LENGTH_LONG).show();
    }

}