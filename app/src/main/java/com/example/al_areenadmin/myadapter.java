package com.example.al_areenadmin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import java.util.logging.Handler;

public class myadapter extends FirebaseRecyclerAdapter<model,myadapter.myviewholder> {

    public myadapter(@NonNull FirebaseRecyclerOptions<model> options) {

        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model model) {

        holder.name.setText(model.getName());
        holder.id.setText(model.getId());
        holder.email.setText(model.getEmail());
        holder.Patient_Name.setText(model.getPatient_Name());
        holder.Inj_Des.setText(model.getInj_Des());
        holder.Inj_Place.setText(model.getInj_Place());
        holder.Calender.setText(model.getCalender());
        holder.Date.setText(model.getDate());

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        return new myviewholder(v);

    }

    class myviewholder extends RecyclerView.ViewHolder
    {

        TextView name , id , email , Patient_Name, Inj_Place , Inj_Des , Calender , Date ;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            name =itemView.findViewById(R.id.Name);
            id =itemView.findViewById(R.id.ID);
            email =itemView.findViewById(R.id.Email);
            Patient_Name =itemView.findViewById(R.id.name);
            Inj_Place =itemView.findViewById(R.id.Place);
            Inj_Des =itemView.findViewById(R.id.des);
            Calender =itemView.findViewById(R.id.Cal);
            Date =itemView.findViewById(R.id.Date);


        }
    }

}
