package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Tasks createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping task", "tomatoes", 2, false);
            case PAINTING:
                return new PaintingTask("Painting task", "brown", "fence", false);
            case DRIVING:
                return new DrivingTask("Driving task", "cinema", "car", false);
            default: return null;
        }
    }
}