package com.example.assignment4;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ChoiceViewHolder> {



    GroceryModel  choiceModel ;
    public Adapter() {
        super();
        choiceModel = choiceModel.getSingleton();
    }

    @NonNull
    @Override
    public ChoiceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.choiceview,parent,false);
        ChoiceViewHolder vh = new ChoiceViewHolder(v);
        return vh;
    }

    Double sum=0.0;
    @Override
    public void onBindViewHolder(@NonNull ChoiceViewHolder holder, int position) {
        TextView text = holder.convienceViewReference.findViewById(R.id.Choice);
        TextView textprice = holder.convienceViewReference.findViewById(R.id.PriceItem);

        text.setText(choiceModel.choiceList.get(position).str);
        textprice.setText(String.valueOf(choiceModel.choiceList.get(position).price));




    }

    @Override
    public int getItemCount() {
        return choiceModel.choiceList.size();
    }

    public static class ChoiceViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout convienceViewReference;
        public ChoiceViewHolder(LinearLayout a) {
            super(a);
            convienceViewReference = a;
        }
    }
}
