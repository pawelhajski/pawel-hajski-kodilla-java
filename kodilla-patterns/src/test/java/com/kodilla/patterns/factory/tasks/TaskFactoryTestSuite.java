package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.prototype.Task;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Tasks shopping = factory.createTask("SHOPPING");
        shopping.executeTask();

        //Then
        Assert.assertEquals("Shopping task", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Tasks painting = factory.createTask("PAINTING");

        //Then
        Assert.assertEquals("Painting task", painting.getTaskName());
        Assert.assertEquals(false, painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Tasks driving = factory.createTask("DRIVING");

        //Then
        Assert.assertEquals("Driving task", driving.getTaskName());
        Assert.assertEquals("Driving to cinema using car.", driving.executeTask());
    }
}
