package com.tw.cn.cap.gtb.todo;

public class TaskFactory {
    private TaskFactory(){

    }
    static Task createTask( int id,String line) {
        final var fields =line.split(" ", 2);
        final var name = fields[1];
        final boolean isCompleted = fields[0].equals("-");
        return new Task(id, name,isCompleted);
    }
}