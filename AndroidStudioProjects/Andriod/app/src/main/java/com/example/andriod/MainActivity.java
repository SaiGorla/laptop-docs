package com.example.andriod;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener  {
    Button  b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.button6);
        b2= (Button) findViewById(R.id.button8);
        b3= (Button) findViewById(R.id.button9);
        b4= (Button) findViewById(R.id.button10);
        b5= (Button) findViewById(R.id.Onto);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
    }


    @Override
    public void onClick(View v)
    {
        if(v.getId()==R.id.button6)
        {
            Intent intent=new Intent(getApplicationContext(),Calender.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.button8)
        {
            Intent in=new Intent(getApplicationContext(),Cardio.class);
            startActivity(in);
        }
        else if (v.getId()==R.id.button9)
        {
            Intent in=new Intent(getApplicationContext(), YogaClass.class);
            startActivity(in);
        }
        else if (v.getId()==R.id.button10)
        {
            Intent in=new Intent(getApplicationContext(),  LoginActivity.class);
            startActivity(in);
        }
        else if (v.getId()==R.id.Onto)
        {
            Intent in=new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(in);
        }
    }


}