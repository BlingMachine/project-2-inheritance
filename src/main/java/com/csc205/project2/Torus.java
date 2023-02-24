package com.csc205.project2;

public class Torus extends Shape{

    private double radius;
    private double bigRadius;

    public Torus() {
        super();
        this.radius = 0.0;
        this.bigRadius = 0.0;
    }

    public Torus(double v, double r) {
        super();
        this.radius = v;
        this.bigRadius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getBigRadius() {
        return bigRadius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setBigRadius(double bigRadius) {
        this.bigRadius = bigRadius;
    }

    @Override
    public double surfaceArea() {
        return 4.0 * bigRadius * radius * Math.pow(Math.PI, 2);
    }

    @Override
    public double volume() {
        return (2.0) * Math.pow(Math.PI, 2) * bigRadius * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Torus {");
        sb.append("radius=").append(radius);
        sb.append(", big radius=").append(bigRadius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
