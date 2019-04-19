package com.kodilla.testing.collection;

import org.junit.*;
import org.junit.rules.TestName;

import java.util.*;

public class CollectionTestSuite {
    @Rule
    public TestName name = new TestName();

    @Before
    public void before(){
        System.out.println("Test Case: executing test " + name.getMethodName());
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Collection Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Collection Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(testList);
        //Then
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testList = new ArrayList<Integer>();
        for(int i=0; i<10; i++) {
            testList.add(i+1);
        }
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(testList);
        //Then
        Assert.assertEquals(5, result.size());
    }
}