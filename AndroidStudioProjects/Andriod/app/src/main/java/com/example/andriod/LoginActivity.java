package com.example.andriod;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity {
    Button b1;

    @Override
    public void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.login);
        addListenerOnButton();

    }
     public void addListenerOnButton(){
        final Context context =  this;

        b1 = (Button) findViewById(R.id.Lgn);
         b1.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View arg0) {

                 Intent intent = new Intent(context, RateCard.class);
                 startActivity(intent);

             }

         });
     }

}
