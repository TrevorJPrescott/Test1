package com.mobileapps.trainingweek1day4;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    TextView tvPhoneNumberDisplay;
    EditText etPhoneNumberFromUser;
    ImageView ivImageToDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPhoneNumberDisplay = findViewById(R.id.tvDisplayPhoneNumber);
        etPhoneNumberFromUser = findViewById(R.id.etPhoneNumber);
        ivImageToDisplay = findViewById(R.id.ivImageToDisplay);
        Glide.with(this).load("http://goo.gl/gEgYUd").into(ivImageToDisplay);
        //ivImageToDisplay.setImageResource(R.drawable.image_to_display_one);
    }

    public void onButtonClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btnDisplayPhoneNumber:
                String phoneNum = etPhoneNumberFromUser.getText().toString();
                tvPhoneNumberDisplay.setText(phoneNum);
                break;
            case R.id.btnGotoRelLayout:
                intent = new Intent(this, RealiveLayout.class);
                intent.putExtra("INFO", "Value of info");
                startActivity(intent);
                break;
            case R.id.btnGotoConstantLayout:
                intent = new Intent(this, Main2Activity.class);
                startActivityForResult(intent, 999);
                break;
        }


        String phoneNum = etPhoneNumberFromUser.getText().toString();

        tvPhoneNumberDisplay.setText(phoneNum);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);




    }
}
