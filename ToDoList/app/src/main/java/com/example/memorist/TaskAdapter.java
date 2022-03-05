package com.example.memorist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.MyViewHolder> {
    Context context;
    private ArrayList<MyTask>myTask;
    private LayoutInflater mInflater;

    public TaskAdapter(Context ctx, ArrayList<MyTask> task){
        context = ctx;
        myTask = task;
        mInflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.tasklist_item, parent, false);
        return new MyViewHolder(mItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(myTask.get(position).getTitle());
        holder.date.setText(myTask.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return myTask.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title, date;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            date = (TextView) itemView.findViewById(R.id.date);
        }
    }
}
