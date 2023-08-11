package com.example.myapplicationp38;



import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.radioGroup01);
        rb1 = findViewById(R.id.radio01);
        rb2 = findViewById(R.id.radio02);

    }

    public void onSelectButtonClicked(View view) {
        if(rb1.isChecked() == true) {
            Toast.makeText(getApplicationContext(), "남성", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(), "여성", Toast.LENGTH_LONG).show();
        }
    }
}
