package com.kodilla.spring.portfolio;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addToDoListTask(String task) {
        toDoList.addTask(task);
    }

    public void addInProgressListTask(String task) {
        inProgressList.addTask(task);
    }

    public void addDoneListTask(String task) {
        doneList.addTask(task);
    }

    public void printAllTasks() {
        System.out.println("Tasks in to-do-list: ");
        toDoList.printTasks();
        System.out.println("Tasks in in-progress-list: ");
        inProgressList.printTasks();
        System.out.println("Tasks in done-list: ");
        doneList.printTasks();
    }

    public String getAllTasks() {
        String result = toDoList.getTasks() + ", " + inProgressList.getTasks() + ", " + doneList.getTasks();
        return result;
    }
}