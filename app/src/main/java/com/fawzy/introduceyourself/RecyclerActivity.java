package com.fawzy.introduceyourself;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {
RecyclerView rv ;
String i1 [] ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        rv = findViewById(R.id.rec_view);

        i1 = getResources().getStringArray(R.array.My_Data);

        Adapter adapter = new Adapter(i1);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);




    }
}
