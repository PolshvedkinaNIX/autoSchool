package com.module3.figure;

public class Triangle<halfPerimeter> extends Figure
{
    private String name;
    private Point a;
    private Point b;
    private Point c;
    private Line ab;
    private Line bc;
    private Line ca;
    private float halfPerimeter;
    private float area;

    @Override
    public float getArea()
    {
        this.halfPerimeter = (ab.getLength()+ bc.getLength()+ ca.getLength())/2;
        this.area = (float) (Math.sqrt(halfPerimeter*(halfPerimeter - ab.getLength())*(halfPerimeter - bc.getLength())*(halfPerimeter - ca.getLength())));
        return area;
    }
    public Triangle(float aX, float aY, float bX, float bY,float cX, float cY) // constructor
    {

        this.a = new Point(aX, aY);
        this.b = new Point(bX, bY);
        this.c = new Point(cX, cY);
        this.ab = new Line(a.getX(), a.getY(), b.getX(), b.getY());
        this.bc = new Line(b.getX(), b.getY(), c.getX(), c.getY());
        this.ca = new Line(c.getX(), c.getY(), a.getX(), a.getY());
        //проверка существования такого треугольника должна происходить до конструктора!!!
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public static boolean existenceCheck(Line ab, Line bc, Line ca)
    /* проверка существования треугольника в согласии с правилом, что каждая сторона должна быть меньше суммы остальных
    она оказалась не нужна, но вдруг потом пригодится =) */
    {
        boolean validTriangle = false;
        if ((ca.getLength() < ab.getLength() + bc.getLength()) && (ab.getLength() < bc.getLength() + ca.getLength()) && (ab.getLength() < bc.getLength() + ca.getLength()))
            validTriangle = true;
        return validTriangle;
    }
}
