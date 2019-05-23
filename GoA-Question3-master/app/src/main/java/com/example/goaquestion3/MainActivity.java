package com.example.goaquestion3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton clickedImage1 = (ImageButton) findViewById(R.id.imageView1);
        ImageButton clickedImage2 = (ImageButton) findViewById(R.id.imageView2);
        ImageButton clickedImage3 = (ImageButton) findViewById(R.id.imageView3);
        ImageButton clickedImage4 = (ImageButton) findViewById(R.id.imageView4);
        ImageButton clickedImage5 = (ImageButton) findViewById(R.id.imageView5);

        clickedImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFullscreenActivity = new Intent(MainActivity.this, image1.class);
                startActivity(intentFullscreenActivity);
            }
        });
        clickedImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFullscreenActivity = new Intent(MainActivity.this, image2.class);
                startActivity(intentFullscreenActivity);
            }
        });
        clickedImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFullscreenActivity = new Intent(MainActivity.this, image3.class);
                startActivity(intentFullscreenActivity);
            }
        });
        clickedImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFullscreenActivity = new Intent(MainActivity.this, image4.class);
                startActivity(intentFullscreenActivity);
            }
        });
        clickedImage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFullscreenActivity = new Intent(MainActivity.this, image5.class);
                startActivity(intentFullscreenActivity);
            }
        });
        }
    }