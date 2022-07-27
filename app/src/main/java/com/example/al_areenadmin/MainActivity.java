package com.example.al_areenadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView addNotice , DeleteNotice , addstd, reservation , rates , feedback ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addstd=findViewById(R.id.addstd);
        addstd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){

                    case R.id.addstd:
                        Intent intent = new Intent(MainActivity.this,Regist.class);
                        startActivity(intent);
                        break;
                }
            }
        });

        addNotice = findViewById(R.id.addNotice);
        addNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){

                    case R.id.addNotice:
                        Intent intent = new Intent(MainActivity.this,Upload_Notice.class);
                        startActivity(intent);
                        break;
                }
            }
        });



        DeleteNotice = findViewById(R.id.DeleteNotice);
        DeleteNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Del_Notice.class));

            }
        });

        rates = findViewById(R.id.rates);
        rates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,rateshow.class));

            }
        });


        reservation = findViewById(R.id.reservation);
        reservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,reservationshow.class));

            }
        });


        feedback = findViewById(R.id.feedback);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,feedbackshow.class));

            }
        });

    }
}