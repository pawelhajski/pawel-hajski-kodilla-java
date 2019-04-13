package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        System.out.println("SimpleUser - test");
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Calculator - test");

        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(5,10);
        int resultSubtract = calculator.subtract(15, 5);

        if(resultAdd == 15) {
            System.out.println("add test OK");
        } else {
            System.out.println("add test error");
        }

        if(resultSubtract == 10) {
            System.out.println("subtract test OK");
        } else {
            System.out.println("subtract test error");
        }
    }
}