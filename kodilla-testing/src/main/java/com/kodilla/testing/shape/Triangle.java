package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String shapeName = "triangle";
    private double field;
    private double sideA;
    private double height;

    public Triangle(double sideA, double height) {
        this.sideA = sideA;
        this.height = height;
    }

    public void triangleField() {
        this.field = sideA*height*0.5;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        triangleField();
        return this.field;
    }
}
