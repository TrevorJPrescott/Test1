package com.trevorpc.trainingweek1day4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RealLayout extends AppCompatActivity {
    TextView a;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_layout);

        Intent intent = getIntent();
        String passedString = intent.getStringExtra("INFO");
    }
}
