package com.example.fit3162_app;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class SymptomRecyclerviewHolderClass extends RecyclerView.ViewHolder {
    TextView name;
    TextView description;
    ViewGroup viewGroup;

    public SymptomRecyclerviewHolderClass(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.symptom_name);
        description=itemView.findViewById(R.id.symptom_description);
        viewGroup=itemView.findViewById(R.id.item_layout);
    }
}
