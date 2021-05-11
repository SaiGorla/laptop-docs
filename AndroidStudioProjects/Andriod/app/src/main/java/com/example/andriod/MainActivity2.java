package com.example.andriod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity2 extends AppCompatActivity implements OnClickListener {

    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1= (Button) findViewById(R.id.Lgn);
        b2= (Button) findViewById(R.id.Sgnup);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }



    public void onClick(View v) {
        if (v.getId() == R.id.Lgn) {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.Sgnup) {
            Intent in = new Intent(getApplicationContext(), SignupActivity.class);
            startActivity(in);
        }
    }}