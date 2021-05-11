package com.example.curtainsrus;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final int reqC = 7;

    TextView orderDesc;
    TextView totalCost;


    String orderDescription=" ";

    private double costPerSquareFoot = 0.25;

    private double orderCost = 0.0;
    Button adding,clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adding = findViewById(R.id.add);
        clear=findViewById(R.id.ClearBtn);
        orderDesc = findViewById(R.id.orderDesc);
        totalCost = findViewById(R.id.totalCostV);

        adding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent I = new Intent(getApplicationContext(), CurtainActivity.class);

                I.putExtra("costOfEachSquareFoot", costPerSquareFoot);


                startActivityForResult(I, reqC);


            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                orderCost=0.0;
                orderDescription="";
                orderDesc.setText(" Curtain: ");
                totalCost.setText("total: ");


            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == reqC) {
            if (resultCode == CurtainActivity.successCode) {
                double cost = data.getDoubleExtra("result", 0);
                String width = data.getStringExtra("width");
                String height = data.getStringExtra("height");


                orderDescription=orderDescription+  "curtain: "+width+"ft by "+height+"ft for " + cost+"\n";
                orderDesc.setText(orderDescription);

                orderCost=orderCost+cost;
                totalCost.setText("Total : " + orderCost+" ");

            }
            else if(resultCode == CurtainActivity.errorCode) {

                orderDesc.setText("Error Code");


                totalCost.setText("Pressed on cancel" );

                Toast.makeText(getApplicationContext(),"Error ",Toast.LENGTH_SHORT).show();
            }

        }


    }
}
