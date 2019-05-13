package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.addToDoListTask("Task 4");
        board.addToDoListTask("Task 3");
        board.addInProgressListTask("Task 2");
        board.addDoneListTask("Task 1");
        //Then
        board.printAllTasks();
        String result = board.getAllTasks();
        Assert.assertEquals("Task 4, Task 3, Task 2, Task 1", result);
    }
}