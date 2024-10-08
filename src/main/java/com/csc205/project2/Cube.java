package com.csc205.project2;

public class Cube extends Shape {

    /* what i asked copilot :
    generate two separate methods for cube class
    to calculate the surface area and volume of a
    cube using the established variable width*/

    private double width;

    public Cube() {
        super();
        this.width = 0.0;
    }

    public Cube(double v) {
        super();
        this.width = v;
    }

    public double getWidth() { return width; }

    public void setWidth(double width) { this.width = width; }

    public double surfaceArea() { return 6.0 * Math.pow(width, 2); }

    public double volume() { return Math.pow(width, 3); }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width = ").append(width);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
