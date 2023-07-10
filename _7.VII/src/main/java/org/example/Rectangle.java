package org.example;

class Rectangle implements Shape{
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double calculateArea() {
        return a * b;
    }
    public int calculatePerimeter() {
        return 2 * a + 2 * b;
    }
}
