package com.example.memorist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class TaskDetail extends AppCompatActivity {
    TaskAdapter taskAdapter;
    List<MyTask> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detail);

        TextView titles = findViewById(R.id.editTextTitle);
        TextView courses = findViewById(R.id.editTextCourse);
        TextView dates = findViewById(R.id.editTextDate);
        TextView descriptions = findViewById(R.id.editTextDesc);
        Button deleteBtn = findViewById(R.id.buttonDelete);

        deleteBtn.setOnClickListener(view ->{

        });

        Intent intent = getIntent();

        String title = intent.getStringExtra(AddNewTask.EXTRA_TITLE);
        titles.setText(title);

        String course = intent.getStringExtra(AddNewTask.EXTRA_COURSE);
        courses.setText(course);

        String date = intent.getStringExtra(AddNewTask.EXTRA_DATE);
        dates.setText(date);

        String desc = intent.getStringExtra(AddNewTask.EXTRA_DESC);
        descriptions.setText(desc);

        System.out.println("Course " + course);
        System.out.println("title" + title);
        System.out.println("date" + date);
        System.out.println("desc" + desc);
    }
}