package com.example.al_areenadmin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class feedadapter extends FirebaseRecyclerAdapter<feed,feedadapter.feedholder> {

    public feedadapter(@NonNull FirebaseRecyclerOptions<feed> options2) {

        super(options2);
    }

    @Override
    protected void onBindViewHolder(@NonNull feedholder holder, int position, @NonNull feed feed) {
        holder.feed.setText(feed.getFeed());

    }

    @NonNull
    @Override
    public feedholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.feed,parent,false);

        return new feedholder(v);
    }


    class feedholder extends RecyclerView.ViewHolder
    {

        TextView feed ;

        public feedholder(@NonNull View itemView) {
            super(itemView);
            feed = itemView.findViewById(R.id.feeds);

        }
    }



}