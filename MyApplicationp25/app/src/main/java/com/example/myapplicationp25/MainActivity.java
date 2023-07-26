package com.example.myapplicationp25;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    ScrollView scrollView;
    ImageView imageView;
    BitmapDrawable bitmap;
    boolean chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.scrollView);
        imageView = findViewById(R.id.imageView);
        scrollView.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bitmap = (BitmapDrawable)res.getDrawable(R.drawable.green1);

        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }
    public void onButton1Clicked(View view) {
        changeImage();
    }

    private void changeImage() {
        Resources res = getResources();

        if(!chk){

            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.green2);

            chk= true;
        }else if(chk){
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.green1);

            chk = false;
        }
        imageView.setImageDrawable(bitmap);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();


        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }
}
