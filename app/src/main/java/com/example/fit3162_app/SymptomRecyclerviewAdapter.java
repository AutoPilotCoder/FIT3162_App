package com.example.fit3162_app;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SymptomRecyclerviewAdapter extends RecyclerView.Adapter<SymptomRecyclerviewHolderClass> {

    Context context;
    List<SymptomsRecyclerviewItem> items;
    SymptomRecyclerviewItemOnClickListener listener;

    public SymptomRecyclerviewAdapter(Context context, List<SymptomsRecyclerviewItem> items, SymptomRecyclerviewItemOnClickListener listener) {
        this.context = context;
        this.items = items;
        this.listener=listener;
    }

    @NonNull
    @Override
    public SymptomRecyclerviewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SymptomRecyclerviewHolderClass(LayoutInflater.from(context).inflate(R.layout.symptoms_recyclerview_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SymptomRecyclerviewHolderClass holder, int position) {
        holder.name.setText(items.get(position).getSymptom_name());
        holder.description.setText(items.get(position).getShort_description());
        holder.viewGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClicked(items.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
