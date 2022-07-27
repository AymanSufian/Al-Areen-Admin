package com.example.al_areenadmin;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class rateadapter extends FirebaseRecyclerAdapter<rate,rateadapter.viewholder> {

    public rateadapter(@NonNull FirebaseRecyclerOptions<rate> options1) {

        super(options1);
    }

    @Override
    protected void onBindViewHolder(@NonNull viewholder holder, int position, @NonNull rate rate) {
        holder.rate.setText(rate.getRate());

    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rate,parent,false);

        return new viewholder(v);
    }

    class viewholder extends RecyclerView.ViewHolder
    {

        TextView rate ;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            rate = itemView.findViewById(R.id.rates);

        }
    }


}
