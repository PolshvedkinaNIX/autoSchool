package com.module3.figure;

public class Square extends Figure
{
    private String name;
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private Line side;
    private float area;

    @Override
    public float getArea()
    {
        this.area = (float) (Math.pow(side.getLength(), 2));
        return area;
    }
    public Square(float aX, float aY, float bX, float bY,float cX, float cY,float dX, float dY) // constructor
    {
        this.a = new Point(aX, aY);
        this.b = new Point(bX, bY);
        this.c = new Point(cX, cY);
        this.d = new Point(dX, dY);
        this.side = new Line(a.getX(), a.getY(), c.getX(), b.getY());
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
