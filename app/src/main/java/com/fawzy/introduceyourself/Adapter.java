package com.fawzy.introduceyourself;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class Adapter  extends RecyclerView.Adapter<Adapter.InfViewHolder> {

  private String data[] ;


    public Adapter(String[] data ) {
        this.data = data;
    }



    public class InfViewHolder extends RecyclerView.ViewHolder{
        public TextView source ;

        public InfViewHolder(@NonNull View itemView) {
            super(itemView);
            source = itemView.findViewById(R.id.source_txt);

        }
    }


    @NonNull
    @Override
    public InfViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.raw,parent,false);
        return new  InfViewHolder (v);
    }

    @Override
    public void onBindViewHolder(@NonNull InfViewHolder holder, final int position) {
        holder.source.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }


}
