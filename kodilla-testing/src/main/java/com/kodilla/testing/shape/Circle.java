package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String shapeName = "circle";
    private double field;
    private double pi = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void circleField() {
        this.field = (radius*radius)*pi;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        circleField();
        return this.field;
    }
}
