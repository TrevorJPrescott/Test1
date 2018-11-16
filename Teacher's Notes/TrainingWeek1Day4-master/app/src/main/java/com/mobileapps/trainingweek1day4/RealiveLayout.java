package com.mobileapps.trainingweek1day4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RealiveLayout extends AppCompatActivity {
    TextView tvDisplayData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realive_layout);
        tvDisplayData = findViewById(R.id.tvOne);

        Intent intent = getIntent();
        String passedString = intent.getStringExtra("INFO");
        tvDisplayData.setText(passedString);

    }
}
