package com.example.memorist;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

public class TaskAdapter extends ListAdapter<MyTask, TaskViewHolder> {
    Context context;

    protected TaskAdapter(@NonNull DiffUtil.ItemCallback<MyTask> diffCallback, Context context) {
        super(diffCallback);
        this.context = context;

    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return TaskViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        MyTask currentTask = getItem(position);
        holder.bind(currentTask.getTitle(),currentTask.getDate());
        holder.layoutView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent item = new Intent(context, TaskDetail.class);
                item.putExtra(AddNewTask.EXTRA_TITLE,currentTask.getTitle());
                item.putExtra(AddNewTask.EXTRA_COURSE,currentTask.getCourse());
                item.putExtra(AddNewTask.EXTRA_DATE,currentTask.getDate());
                item.putExtra(AddNewTask.EXTRA_DESC,currentTask.getDesc());
                context.startActivity(item);
            }
        });
    }

    static class TaskDiff extends DiffUtil.ItemCallback<MyTask> {

        @Override
        public boolean areItemsTheSame(@NonNull MyTask oldItem, @NonNull MyTask newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull MyTask oldItem, @NonNull MyTask newItem) {
            return oldItem.getTitle().equals(newItem.getTitle());
        }
    }
}
