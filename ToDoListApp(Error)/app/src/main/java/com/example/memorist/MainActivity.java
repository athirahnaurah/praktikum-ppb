package com.example.memorist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mytask;
    ArrayList<MyTask> list;
    TaskAdapter taskAdapter;
    Button fabAddNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        fabAddNew = findViewById(R.id.fabAddNew);
        list = new ArrayList<MyTask>();
        // get data
        for (int i=1; i <= 8; i++){
            MyTask t = new MyTask("Tugas "+i, "28 Februari 2022","Membuat aplikasi to do list","Mobile");
            list.add(t);
        }

        // Get a handle to the RecyclerView.
        mytask = findViewById(R.id.mytask);
        // Create an adapter and supply the data to be displayed.
        taskAdapter = new TaskAdapter(this, list);
        // Connect the adapter with the RecyclerView.
        mytask.setAdapter(taskAdapter);
        // Give the RecyclerView a default layout manager.
        mytask.setLayoutManager(new LinearLayoutManager(this));
    }
}