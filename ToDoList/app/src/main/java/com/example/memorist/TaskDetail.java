package com.example.memorist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TaskDetail extends AppCompatActivity {
    TextView title, course, date, desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detail);

        title = findViewById(R.id.theTitle);
        course = findViewById(R.id.theCourse);
        date = findViewById(R.id.theduedate);
        desc = findViewById(R.id.desc);

        //get a value from previous page
        title.setText(getIntent().getStringExtra("title"));
        course.setText(getIntent().getStringExtra("course"));
        date.setText(getIntent().getStringExtra("date"));
        desc.setText(getIntent().getStringExtra("desc"));
    }
}