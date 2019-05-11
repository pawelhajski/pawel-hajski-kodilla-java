package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private final Display display;

    public Calculator(final Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double val = a+b;
        display.displayValue(val);
        return val;
    }

    public double sub(double a, double b) {
        double val = a-b;
        display.displayValue(val);
        return val;
    }

    public double mul(double a, double b) {
        double val = a*b;
        display.displayValue(val);
        return val;
    }

    public double div(double a, double b) {
        double val = 0.0;
        if (b != 0.0) {
            val = a / b;
            display.displayValue(val);
        } else {
            System.out.println("You cannot divide by 0 (zero)!");
        }
        return val;
    }
}
