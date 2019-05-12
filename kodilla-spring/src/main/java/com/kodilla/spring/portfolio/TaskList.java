package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Adding task: " + task + " to the list.");
    }

    public void getTasks() {
        tasks.stream()
                .forEach(System.out::println);
    }
}