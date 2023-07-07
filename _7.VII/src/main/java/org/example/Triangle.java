package org.example;

class Triangle implements Shape {
    private int bc;
    private int ac;
    private int ab;
    private int hc;

    public Triangle (int bc, int ac, int ab, int hc) {
        this.bc = bc;
        this.ac = ac;
        this.ab = ab;
        this.hc = hc;
        }
    public double calculateArea() {
        return 0.5 * hc * ab;
        }
        public int calculatePerimeter() {
        return ab + bc + ac;
        }
}
