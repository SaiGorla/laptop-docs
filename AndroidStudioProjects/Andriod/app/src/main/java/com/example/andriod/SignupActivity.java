package com.example.andriod;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends Activity {
    Button B1;
    EditText name,Email,Password,Phone,Address;
    FirebaseAuth fAuth;
    ProgressBar progressBar;

    @Override
    public void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.signup);

        name = findViewById(R.id.name);
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.pswd);
        Phone = findViewById(R.id.Phone);
        Address = findViewById(R.id.Address);
        B1 = findViewById(R.id.Signup);
        fAuth = FirebaseAuth.getInstance();

        addListenerOnButton();

    }
       public void addListenerOnButton(){
        final Context context = this;

           B1 = (Button) findViewById(R.id.Signup);
           B1.setOnClickListener(new View.OnClickListener() {

               @Override
               public void onClick(View arg0) {

                   Intent intent = new Intent(context, LoginActivity.class);
                   startActivity(intent);

               }

           });
       }

}
