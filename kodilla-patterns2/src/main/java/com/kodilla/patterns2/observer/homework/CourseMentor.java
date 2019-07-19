package com.kodilla.patterns2.observer.homework;

public class CourseMentor implements Observer {
    private String name;
    private int counter;

    public CourseMentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        System.out.println(name + ": new task submitted for revision by " + tasksQueue.getParticipant() + "\n" +
                " (total tasks waiting for revision: " + tasksQueue.getTasks().size() + ")");
        counter++;
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter;
    }
}
