package com.example.activity_button_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.activity_button_exercise.MainActivity;
import com.example.activity_button_exercise.R;

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        Activity activity = this;
        Button btn1 = (Button) findViewById(R.id.btnReturn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityThree.this, MainActivity.class));
            }
        });
    }
}