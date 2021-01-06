package com.module3.figure;

public class Circle extends Figure {
    private final Point a;
    private final Point b;
    private final Line diameter;

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
        this.diameter = new Line(a, b);
        setArea();
        setCoordinates(new Point[]{a, b});
    }
    @Override
    public void setArea() {
        super.setArea((float) ((Math.pow((diameter.getLength() / 2), 2)) * Math.PI));
    }
}
