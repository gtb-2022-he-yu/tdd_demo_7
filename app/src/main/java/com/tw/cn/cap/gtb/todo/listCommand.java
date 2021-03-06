package com.tw.cn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

public class listCommand {
    final TaskRepository taskRepository = new TaskRepository();

    public listCommand() {
    }

    List<String> run() {
        final List<Task> tasks = taskRepository.loadTasks();
        final List<String> result = new ArrayList<String>();
        result.addAll(Section.tbd().format(tasks));
        result.addAll(Section.completed().format(tasks));
        return result;
    }
}