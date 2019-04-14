package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(2);
        //When
        shapeCollector.addFigure(square);
        //Then
        Assert.assertEquals(1, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(2);
        shapeCollector.addFigure(square);
        //When
        boolean result = shapeCollector.removeFigure(square);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(2);
        shapeCollector.addFigure(square);
        //When
        Square retrivedSquare = (Square) shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(square, retrivedSquare);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(2);
        shapeCollector.addFigure(square);
        //When
        shapeCollector.showFigures();
        //Then
        Assert.assertEquals("Figure: square, field: 4.0", shapeCollector.showFigures());
    }
}
