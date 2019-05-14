package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        Logger logger =  Logger.getInstance();
        //When
        logger.log("Test log");
        String lastlog = logger.getLastLog();
        //Then
        Assert.assertEquals("Test log", lastlog);
    }
}
