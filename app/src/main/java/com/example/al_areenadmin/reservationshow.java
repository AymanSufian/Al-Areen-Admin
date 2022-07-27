package com.example.al_areenadmin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class reservationshow extends AppCompatActivity {

    RecyclerView recyclerView ;
    myadapter myadapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservationshow);


        recyclerView = findViewById(R.id.recycleView) ;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                .setQuery(FirebaseDatabase.getInstance().getReference().child("Users"),model.class)
                .build();



        myadapter = new myadapter(options);
        recyclerView.setAdapter(myadapter);

    }

    @Override
    protected void onStart(){

        super.onStart();
        myadapter.startListening();
    }

    @Override
    protected void onStop(){

        super.onStop();
        myadapter.stopListening();
    }
}