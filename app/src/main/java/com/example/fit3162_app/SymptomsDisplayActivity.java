package com.example.fit3162_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SymptomsDisplayActivity extends AppCompatActivity {

    RecyclerView symptomsrecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms_display);

        List<SymptomsRecyclerviewItem> items=new ArrayList<>();
        items.add(new SymptomsRecyclerviewItem("name1","desc1"));
        items.add(new SymptomsRecyclerviewItem("name2","desc2"));
        items.add(new SymptomsRecyclerviewItem("name3","desc3"));


        symptomsrecyclerView=findViewById(R.id.Symptoms_recyclerview);
        symptomsrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        symptomsrecyclerView.setAdapter(new SymptomRecyclerviewAdapter(getApplicationContext(),items));
    }
}