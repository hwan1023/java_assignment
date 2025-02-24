package com.hanhwa_java_assignment.assignment07.level01.basic;

public class Circle extends Shape implements Resizable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    public void resize(double factor) {
        radius = radius * factor;
    }
}
