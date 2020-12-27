package com.module3.figure;

public class Circle extends Figure
{
    private Point a;
    private Point b;
    private Line diameter;

    public Circle(float aX, float aY, float bX, float bY) //constructor
    {
        this.a = new Point(aX, aY);
        this.b = new Point(bX, bY);
        this.diameter = new Line(a.getX(), a.getY(), b.getX(), b.getY());
        this.area = (float) ((Math.pow((diameter.getLength()/2), 2))*Math.PI);
        this.coordinates = new Point[]{a, b};
    }
}
