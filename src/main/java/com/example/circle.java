

package com.example;

public class circle {

    public double calculateArea(double radius) {

        if (radius < 0 || !Double.isFinite(radius)) {
            throw new IllegalArgumentException(
                "Radius must be non-negative"
            );
        }

        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        circle circle = new circle();

        double radius = 5;

        double area = circle.calculateArea(radius);

        System.out.println("Radius of Circle: " + radius);
        System.out.println("Area of Circle: " + area);
    }
}
