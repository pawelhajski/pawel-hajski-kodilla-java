package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Tasks {

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean executed;

    public PaintingTask(String taskName, String color, String whatToPaint, boolean executed) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.executed = executed;
    }

    @Override
    public String executeTask() {
        this.executed = true;
        return "Painting " + whatToPaint + " to " + color + " colour.";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}
