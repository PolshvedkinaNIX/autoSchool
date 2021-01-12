package com.module3.figure;

public class Circle extends Figure {
    private final Point a;
    private final Point b;
    private final Line diameter;

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
        this.diameter = new Line(a, b);
        this.coordinates = new Point[]{a, b};
    }

    @Override
    public float calcArea() {
        if (this.area == 0) {
            this.area = (float) ((Math.pow((diameter.calcLength() / 2), 2)) * Math.PI);
        }
        return area;
    }
}
