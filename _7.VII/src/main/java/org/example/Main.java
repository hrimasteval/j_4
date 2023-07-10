package org.example;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        Triangle triangle = new Triangle(2, 4, 5, 2);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
        }
    }