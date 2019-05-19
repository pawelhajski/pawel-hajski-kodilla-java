package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Tasks {

    private final String taskName;
    private final String where;
    private final String using;
    private boolean executed;

    public DrivingTask(String taskName, String where, String using, boolean executed) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.executed = executed;
    }

    @Override
    public String executeTask() {
        this.executed = true;
        return "Driving to " + where + " using " + using + ".";
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
