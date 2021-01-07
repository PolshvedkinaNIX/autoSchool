package com.module3.figure;

public class Square extends Figure {
    private final Point a;
    private Point b;
    private final Point c;
    private Point d;
    private final Line side;
    private Point center;

    public Square(Point a, Point c) // constructor
    {
        this.a = a;//конструктор по двум точкам, используется диагональ, а не сторона, тк только диагональ задает квадрат однозначно (по стороне можно построить 2 квадрата, площадь которых идентична, но положение отличается)
        this.c = c;
        this.center = getCenter(a, c);
        this.b = getB(a, c);
        this.d = getD(a, c);
        this.side = new Line(a, b);
        this.coordinates = new Point[]{a, b, c, d};
    }
    private Point getCenter(Point a, Point c){ //а не нужно ли тогда этот метод и 2 следующих тоже переименновать, или внутренние геттеры бывают?
        float lesserX = Math.min(a.getX(), c.getX());
        float lesserY = Math.min(a.getY(), c.getY());
        return center = new Point(Math.abs(c.getX() - a.getX()) / 2 + lesserX,
                Math.abs(c.getY() - a.getY()) / 2 + lesserY);
    }
    private Point getB(Point a, Point c){
        Point relativeA = new Point(a.getX() - center.getX(), a.getY() - center.getY());
        Point relativeC = new Point(c.getX() - center.getX(), c.getY() - center.getY());
        return b = new Point(relativeC.getY() + center.getX(), relativeA.getX() + center.getY());
    }
    private Point getD(Point a, Point c){
        Point relativeA = new Point(a.getX() - center.getX(), a.getY() - center.getY());
        Point relativeC = new Point(c.getX() - center.getX(), c.getY() - center.getY());
        return d = new Point(relativeA.getY() + center.getX(), relativeC.getX() + center.getY());
    }

    @Override
    public float calcArea() {
        if (this.area == 0){
            this.area = (float) (Math.pow(side.calcLength(), 2));
        }
        return area;
    }
}
