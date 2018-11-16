package com.trevorpc.trainingweek1day4;

import android.app.Instrumentation;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    TextView tvPhoneNumberDisplay;
    EditText etPhoneHome;
    ImageView ivCool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPhoneNumberDisplay = findViewById(R.id.tvDisplayPhoneNumber);
        etPhoneHome = findViewById(R.id.etPhonenumber);
        ivCool = findViewById(R.id.IvCool);
        //ivCool.setImageResource(R.drawable.cool);
        // R = Res
        Glide.with(this).load("https://imgs.xkcd.com/comics/password_strength.png").into(ivCool);

    }

    public void onButtonClick(View view)
    {
        Intent intent;
        switch (view.getId())
        {
            case R.id.btnDisplayPhoneNumber:
                {
                String phoneNum = etPhoneHome.getText().toString();
                //toString: editable -> String

                tvPhoneNumberDisplay.setText(phoneNum);
                break;
                 }

                case R.id.btnGotoRealLayout:
                    {
                    intent = new Intent(this, RealLayout.class);
                    intent.putExtra("INFO","Value of info");
                    startActivity(intent);

                    break;
                    }
                    case R.id.btnGotoRevLayout:
                        {
                        intent = new Intent(this, ConstrainLayout.class);
                        startActivityForResult(intent,999);
                        break;
                        }

                }

        }
    }

