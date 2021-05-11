package com.example.curtainsrus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Double.parseDouble;

public class CurtainActivity extends AppCompatActivity {
    Button order, cncl;
    EditText Width, Hgt;
    public static final int successCode = 0;

    public static final int errorCode = 1;

    double tCost = 0.0;
    double rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curtain);


        order = findViewById(R.id.orderBtn);
        Width = findViewById(R.id.WidthET);
        Hgt = findViewById(R.id.HeightET);
        cncl = findViewById(R.id.cnclBtn);
        Intent I = getIntent();

        rate = getIntent().getDoubleExtra("costOfEachSquareFoot", 0.0);


        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String w = Width.getText().toString();
                String h = Hgt.getText().toString();

                tCost = tCost + parseDouble(w) * parseDouble(h) * rate;

                Intent I = new Intent(getApplicationContext(), MainActivity.class);

                I.putExtra("result", tCost);
                I.putExtra("width", w);
                I.putExtra("height", h);

                setResult(successCode, I);
                finish();

            }
        });

        cncl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent I = new Intent(getApplicationContext(), MainActivity.class);

                setResult(errorCode, I);
                finish();;

            }
        });


    }

}
