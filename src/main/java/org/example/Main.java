package org.example;

import org.example.shape.*;

public class Main {
    public static void main(String[] args) {

        new ShapePrinter().printShapeName(new Circle());
        new ShapePrinter().printShapeName(new Hexagon());
        new ShapePrinter().printShapeName(new Oval());
        new ShapePrinter().printShapeName(new Quad());
        new ShapePrinter().printShapeName(new Triangle());
    }
}