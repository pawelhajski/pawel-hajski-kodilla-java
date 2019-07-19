package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        TasksQueue adamSmithQueue = new TasksQueue("Adam Smith");
        TasksQueue jenniferAnnistonQueue = new TasksQueue("Jennifer Anniston");
        TasksQueue keanuReevesQueue = new TasksQueue("Keanu Reeves");
        TasksQueue angelinaJolieQueue = new TasksQueue("Angelina Jolie");

        CourseMentor danielOlbrychski = new CourseMentor("Daniel Olbrychski");
        CourseMentor andrzejGrabowski = new CourseMentor("Andrzej Grabowski");

        adamSmithQueue.registerObserver(danielOlbrychski);
        jenniferAnnistonQueue.registerObserver(danielOlbrychski);
        keanuReevesQueue.registerObserver(andrzejGrabowski);
        angelinaJolieQueue.registerObserver(andrzejGrabowski);

        //When
        adamSmithQueue.submitTask("Task 1.1");
        adamSmithQueue.submitTask("Task 1.2");
        jenniferAnnistonQueue.submitTask("Task 2.3");
        keanuReevesQueue.submitTask("Task 3.5");
        angelinaJolieQueue.submitTask("Task 5.1");
        angelinaJolieQueue.submitTask("Task 5.2");

        //Then
        assertEquals(3, danielOlbrychski.getCounter());
        assertEquals(3, andrzejGrabowski.getCounter());
    }
}
