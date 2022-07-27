package com.example.al_areenadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class rateshow extends AppCompatActivity {
    RecyclerView recyclerView1 ;
    rateadapter rateadapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rateshow);

        recyclerView1 = findViewById(R.id.recycleView1) ;
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<rate> options1 =
                new FirebaseRecyclerOptions.Builder<rate>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Rating"),rate.class)
                        .build();



        rateadapter = new rateadapter(options1);
        recyclerView1.setAdapter(rateadapter);

    }

    @Override
    protected void onStart(){

        super.onStart();
        rateadapter.startListening();
    }

    @Override
    protected void onStop(){

        super.onStop();
        rateadapter.stopListening();
    }
}