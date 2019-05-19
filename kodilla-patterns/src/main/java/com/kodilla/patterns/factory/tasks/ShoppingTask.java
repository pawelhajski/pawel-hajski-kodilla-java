package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Tasks {

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean executed;

    public ShoppingTask(String taskName, String whatToBuy, double quantity, boolean executed) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.executed = executed;
    }

    @Override
    public String executeTask() {
        this.executed = true;
        return "Buying " + quantity + " of " + whatToBuy + ".";
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
