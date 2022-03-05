package com.example.memorist;

public class MyTask {
    String title;
    String date;
    String desc;
    String course;

    public MyTask(String title, String date, String desc, String course) {
        this.title = title;
        this.date = date;
        this.desc = desc;
        this.course = course;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
