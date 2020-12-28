package com.module3.figure;

public class Triangle extends Figure {
    private Point a;
    private Point b;
    private Point c;
    private Line ab;
    private Line bc;
    private Line ca;
    private float halfPerimeter;

    public Triangle(float aX, float aY, float bX, float bY, float cX, float cY) // constructor
    {
        this.a = new Point(aX, aY);
        this.b = new Point(bX, bY);
        this.c = new Point(cX, cY);
        this.ab = new Line(a.getX(), a.getY(), b.getX(), b.getY());
        this.bc = new Line(b.getX(), b.getY(), c.getX(), c.getY());
        this.ca = new Line(c.getX(), c.getY(), a.getX(), a.getY());
        this.halfPerimeter = (ab.getLength() + bc.getLength() + ca.getLength()) / 2;
        super.setArea((float) (Math.sqrt(halfPerimeter * (halfPerimeter - ab.getLength())
                * (halfPerimeter - bc.getLength()) * (halfPerimeter - ca.getLength()))));
        setCoordinates(new Point[]{a, b, c});
    }
}
