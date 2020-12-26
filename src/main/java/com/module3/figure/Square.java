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
        return area;
    }
    public Square(float aX, float aY, float bX, float bY) // constructor
    {
        this.a = new Point(aX, aY);//конструктор по трем точкам и площадь рассчитывать сразу здесь
        this.b = new Point(bX, bY);
        this.side = new Line(a.getX(), a.getY(), b.getX(), b.getY());
        this.c = new Point(b.getX()+(b.getY()-a.getY()), b.getY()-(a.getX()-b.getX()));
        this.d = new Point(a.getX()+(b.getY()-a.getY()), a.getY()-(a.getX()-b.getX()));
        this.area = (float) (Math.pow(side.getLength(), 2));
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public Line getSide() {
        return side;
    }
}
