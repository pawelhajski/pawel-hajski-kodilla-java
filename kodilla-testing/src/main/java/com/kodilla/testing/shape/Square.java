package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName = "square";
    private double field;
    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    public void squareField() {
        this.field = sideA*sideA;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        squareField();
        return this.field;
    }
}
