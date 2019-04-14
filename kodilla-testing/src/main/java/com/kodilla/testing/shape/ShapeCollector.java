package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result;
        if(figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape calledShape = null;
        if(n >= 0 && n < figures.size()) {
            calledShape = figures.get(n);
        }
        return calledShape;
    }

    public String showFigures() {
        String result = "";
        for(Shape figure : figures) {
            result += "Figure: " + figure.getShapeName() + ", field: " + figure.getField();
        }
        return result;
    }

    public int getFiguresQuantity() {
        return figures.size();
    }

}
