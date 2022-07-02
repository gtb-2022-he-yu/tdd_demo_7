package com.tw.cn.cap.gtb.todo;

public class Task {
    public boolean isCompleted;

    public boolean getCompleted() {
        return isCompleted;
    }

    public String name;
    public   int id;

    public Task(int id,String name, boolean isCompleted) {
        this.name = name;
        this.id = id;
        this.isCompleted=isCompleted;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }



    String format() {
        return String.format("%d %s", getId(), getName());
    }
}
