package com.module3.figure;

public class Circle extends Figure
{
    private String name;
    private Point a;
    private Point b;
    private Line diameter;
    private float area;

    @Override
    public float getArea()
    {
        this.diameter = new Line(a.getX(), a.getY(), b.getX(), b.getY());
        this.area = (float) ((Math.pow((diameter.getLength()/2), 2))*Math.PI);
        return area;
    }
    public Circle(float aX, float aY, float bX, float bY) //constructor
    {
        this.a = new Point(aX, aY);
        this.b = new Point(bX, bY);
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

}
