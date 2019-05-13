package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskList {

    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Adding task: " + task + " to the list.");
    }

    public void printTasks() {
        tasks.stream()
                .forEach(System.out::println);
    }

    public String getTasks() {
       String result = tasks.stream()
                .collect(Collectors.joining(", "));

       return result;
    }
}