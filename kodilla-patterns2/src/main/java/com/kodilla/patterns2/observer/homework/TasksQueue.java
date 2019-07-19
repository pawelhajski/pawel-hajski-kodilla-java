package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class TasksQueue implements Observable {

    private final String participant;
    private final ArrayDeque<String> tasks;
    private final List<Observer> observers;

    public TasksQueue(String participant) {
        tasks = new ArrayDeque<>();
        observers = new ArrayList<>();
        this.participant = participant;
    }

    public void submitTask(String task) {
        tasks.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public String getParticipant() {
        return participant;
    }


    public ArrayDeque<String> getTasks() {
        return tasks;
    }
}
