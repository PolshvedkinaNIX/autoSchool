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
        this.coordinates = new Point[]{a, b, c};
    }

    @Override
    public float calcArea() {
        if (this.area == 0){
            float halfPerimeter = (ab.calcLength() + bc.calcLength() + ca.calcLength()) / 2; //метод не принимает параметров, чтобы для всех фигур была одинаковая сигнатура
            this.area = (float) (Math.sqrt(halfPerimeter * (halfPerimeter - ab.calcLength())
                    * (halfPerimeter - bc.calcLength()) * (halfPerimeter - ca.calcLength())));
        }
        return  area;
    }
}
