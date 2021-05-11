package com.example.gorla_assignment07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rndmfunction;
    int bas;
    // fetchFromURL method fetches the data from a site of particular server
    public static String fetchFromURL(URL url) {
        StringBuilder sbuild = new StringBuilder();
        try {
            BufferedReader br1 = new BufferedReader(new InputStreamReader(url.openStream()));
            String ss;
            while ((ss = br1.readLine()) != null)
                sbuild.append(ss);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sbuild.toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread th = new Thread(new SpinWheels());
        th.start();

        Log.d("Thread 0","Now we have two threads …");
        Button BTN = findViewById(R.id.Btn);

        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new Thread(new Runnable() {
                    @Override
                    // using a random function the random number is generated
                    // that gets the JSON for the particular beer in the given link i.e
                    // https://api.punkapi.com/v2/beers
                    public void run() {
                        try {
                            String strngurl= "https://api.punkapi.com/v2/beers/";
                            rndmfunction= new Random();
                            bas = rndmfunction.nextInt(60);
                            bas += 1;
                            URL link = new URL(strngurl + bas);
                            String json = fetchFromURL(link);
                            Log.d("JSON Fetch", json); // Lets see what we got
                            processJSON(json);
                        }
                        catch (MalformedURLException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }


        });
    }

    // This method fetches the json and display the JSON array details like id,name and abv of the
    //particular random beer.
    public void processJSON(final String json) {
        this.runOnUiThread(new Runnable() {
            @Override
            public void run() {

                TextView box = findViewById(R.id.TXT);
                try
                {
                    JSONArray rslt = new JSONArray(json);
                    Log.d("messa", String.valueOf(rslt));

                    JSONObject js= rslt.getJSONObject(0);
                    String s= js.getString("name");
                    String ABv=js.getString("abv");


                    Log.d("name",s);
                    // String c = reslt.getString("climate");
                    //   String p = reslt.getString("population");
                    box.setText("id: "+ bas +" "+"\nname: "+ s +"\nabv: "+ABv);


                }
                catch (JSONException e)
                {
                    Log.d("JSON", "Exception" + e);
                }
            }
        });
    }

    class SpinWheels implements Runnable {
        @Override
        public void run() {
            for (int p = 10; p >= 0; p--) {
                Log.d("Thread SpinWheels", String.valueOf(p));
            }
        }
    }

}