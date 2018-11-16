package com.trevorpc.week1daily4_intenttodestroy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class infopage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infopage);
    }
    public void OnButtonClick(View view)
    {
        Intent intent;
        switch(view.getId())
        {
            case R.id.toInfo:
                intent = new Intent(this, infopage.class);
                startActivity(intent);
                break;
            case R.id.toDisplay:
                intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                break;

        }

    }
}
