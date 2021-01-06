package com.module3.figure;

public class Triangle extends Figure {
    private final Point a;
    private final Point b;
    private final Point c;
    private final Line ab;
    private final Line bc;
    private final Line ca;

    public Triangle(Point a, Point b, Point c) // constructor
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.ab = new Line(a, b);
        this.bc = new Line(b, c);
        this.ca = new Line(c, a);
        setCoordinates(new Point[]{a, b, c});
        setArea(); //поскольку это private поле в Figure, я не могу его присвоить напрямую
    }

    public void setArea(){
        float halfPerimeter = (ab.getLength() + bc.getLength() + ca.getLength()) / 2; //метод не принимает параметров, чтобы для всех фигур была одинаковая сигнатура
        super.setArea((float) (Math.sqrt(halfPerimeter * (halfPerimeter - ab.getLength())
                * (halfPerimeter - bc.getLength()) * (halfPerimeter - ca.getLength()))));
    }
}
