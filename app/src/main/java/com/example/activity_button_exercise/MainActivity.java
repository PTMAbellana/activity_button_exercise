package com.example.activity_button_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;
        Button btn1 = (Button)findViewById(R.id.btnClose);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, ActivityTwo.class));
            }
        });

        Button btn2 = (Button)findViewById(R.id.btnToast);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Displaying simple Toast message
                Toast.makeText(getApplicationContext(), "Hello let's make a toasty message", Toast.LENGTH_LONG).show();
            }
        });
        //Button 3 change background

        Button btn3 = (Button)findViewById(R.id.btnChangeBG);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int color = Color.argb(255, random.nextInt(255),random.nextInt(255), random.nextInt(255));
                activity.findViewById(android.R.id.content).setBackgroundColor(color);
            }
        });
        //Change button color
        Button btn4 = (Button)findViewById(R.id.btnChangeButtonBG);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int color = Color.argb(255, random.nextInt(255),random.nextInt(255), random.nextInt(255));
                btn4.setBackgroundColor(color);
            }
        });
        //Disappear the button
        Button btn5 = (Button)findViewById(R.id.btnDisappear);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn5.setVisibility(view.INVISIBLE);
            }

        });
        Button btn6 = (Button)findViewById(R.id.btnIG);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ActivityThree.class));
            }

        });
    }
}