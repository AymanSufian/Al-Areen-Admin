package com.example.al_areenadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class feedbackshow extends AppCompatActivity {
    RecyclerView recyclerView2 ;
    feedadapter feedadapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedbackshow);


        recyclerView2 = findViewById(R.id.recycleView2) ;
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<feed> options2 =
                new FirebaseRecyclerOptions.Builder<feed>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Feedback"),feed.class)
                        .build();



        feedadapter = new feedadapter(options2);
        recyclerView2.setAdapter(feedadapter);

    }

    @Override
    protected void onStart(){

        super.onStart();
        feedadapter.startListening();
    }

    @Override
    protected void onStop(){

        super.onStop();
        feedadapter.stopListening();
    }
}