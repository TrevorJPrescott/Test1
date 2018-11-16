package com.trevorpc.assessmentproblemdefinitionpart2test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class problem1 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem1);
        //f("errors in strategy cannot be correct through tactical maneuvers");
        g("shootIamOutofTime");
    }


    public String f(String input)
    {
        String output="";

        for(int x=0;x<=input.length();x++)
        {
             int temp = input.charAt(x);
             if(temp!= ' ')
             {
                 temp = 123 - temp;
                 while (temp < 97)
                 {
                     temp = temp + 32;
                 }
             }
                 char temp2 = (char) temp;
                 Log.d("TAG", "f: " + temp2);
                 output = output + (String.valueOf(temp2));
                 Log.d("TAG", "f: " + output);

        }
        Log.d("why is this not working", "f: "+output);
        return output;
    }

    public void g(String input)
    {
        String output="error";
        input= input.toLowerCase();
        char letter='a';

        int q=0;
        for (int x=1;x<33;x++)
        {
            int Num=0;
            for(int y=0;y<input.length();y++)
            {
                q = input.indexOf(letter);
                if(q>y)
                {
                    y = q;
                    Num++;
                }

            }
            Log.d("TAG", "g: "+letter+": "+Num);

            int temp =(int) letter++;
            letter = (char) temp;


        }


        }
    }
