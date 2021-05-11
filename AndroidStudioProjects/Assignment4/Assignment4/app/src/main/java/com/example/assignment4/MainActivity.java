package com.example.assignment4;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    static String Groname=null;
    static Double price=0.0;
    static Button addbtn, resetbtn;
    private Adapter adapter = null;
    private RecyclerView RV= null;
    private GestureDetectorCompat choiceDetector = null;
    static EditText GroceryName,priceet;
    static TextView totalpriceTextView;

    Double total_sum=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final EditText input = findViewById(R.id.ET1);
        setContentView(R.layout.activity_main);
        GroceryName=findViewById(R.id.ET1);
        priceet=findViewById(R.id.Price);

        addbtn= findViewById(R.id.AddBtn);
        resetbtn= findViewById(R.id.RstBtn);
        totalpriceTextView=  findViewById(R.id.totalprice);
        Button CLear= findViewById(R.id.button1);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GroceryModel model= GroceryModel.getSingleton();

                Groname=GroceryName.getText().toString();
                price=Double.valueOf(priceet.getText().toString());
                model.add(Groname,price);
                total_sum=0.0;

                for(int i=0;i< adapter.choiceModel.choiceList.size();i++){
                    Double price=adapter.choiceModel.choiceList.get(i).getPrice();//getPrice() is a getter method in your POJO class.
                    total_sum+= price;

                }


                totalpriceTextView.setText(total_sum+"");

                adapter.notifyDataSetChanged();

            }
        });

        CLear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String Text = input.getText().toString();
                input.setText("");
            }
        });

        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GroceryModel model= GroceryModel.getSingleton();
                model.reset();

                total_sum=0.0;

                for(int i=0;i< adapter.choiceModel.choiceList.size();i++){
                    Double price=adapter.choiceModel.choiceList.get(i).getPrice();//getPrice() is a getter method in your POJO class.
                    total_sum+= price;

                }


                totalpriceTextView.setText(total_sum+"");
                adapter.notifyDataSetChanged();
            }
        });

        adapter= new Adapter();
        RV=findViewById(R.id.RecycleView);
        RV.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RV.setLayoutManager(layoutManager);


        for(int i=0;i< adapter.choiceModel.choiceList.size();i++){
            Double price=adapter.choiceModel.choiceList.get(i).getPrice();//getPrice() is a getter method in your POJO class.
            total_sum+= price;

        }
        totalpriceTextView.setText(total_sum+"");


        choiceDetector=new GestureDetectorCompat(this, new RecyclerViewOnGestureListener());
        RV.addOnItemTouchListener(new RecyclerView.SimpleOnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                return choiceDetector.onTouchEvent(e);
            }
        });
    }




    private class RecyclerViewOnGestureListener extends GestureDetector.SimpleOnGestureListener {

        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            View view = RV.findChildViewUnder(e.getX(), e.getY());
            if (view != null) {
                RecyclerView.ViewHolder holder = RV.getChildViewHolder(view);
                if (holder instanceof Adapter.ChoiceViewHolder) {
                    int position = holder.getAdapterPosition();
                    GroceryModel myModel =GroceryModel.getSingleton();
                    myModel.choiceList.remove(position);
                    total_sum=0.0;

                    for(int i=0;i< adapter.choiceModel.choiceList.size();i++){
                        Double price=adapter.choiceModel.choiceList.get(i).getPrice();//getPrice() is a getter method in your POJO class.
                        total_sum+= price;

                    }


                    totalpriceTextView.setText(total_sum+"");
                    adapter.notifyItemRemoved(position);
                    return true;
                }
            }
            return false;
        }
    }
}
