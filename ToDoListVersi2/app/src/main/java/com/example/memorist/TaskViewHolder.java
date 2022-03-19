package com.example.memorist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TaskViewHolder extends RecyclerView.ViewHolder{
    LinearLayout layoutView;
    private final TextView textViewTitle;
    private final TextView textViewDate;

    public TaskViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewTitle = itemView.findViewById(R.id.title);
        textViewDate = itemView.findViewById(R.id.date);
        layoutView = itemView.findViewById(R.id.layoutView);
    }

    public void bind(String title, String date) {
        textViewTitle.setText(title);
        textViewDate.setText(date);
    }

    static TaskViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tasklist_item, parent, false);
        return new TaskViewHolder(view);
    }
}
