package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15, 17};

        //When
        double expected = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(9.0, expected, 0.01);
    }
}
