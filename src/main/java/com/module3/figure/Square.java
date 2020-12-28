package com.module3.figure;

public class Square extends Figure {
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private Line side;
    private Point center;

    public Square(float aX, float aY, float cX, float cY) // constructor
    {
        this.a = new Point(aX, aY);//конструктор по двум точкам (на диагонали)
        this.c = new Point(cX, cY);
        float lesserX, lesserY;
        if (a.getX() > c.getX())
            lesserX = c.getX();
        else
            lesserX = a.getX();

        if (a.getY() > c.getY())
            lesserY = c.getY();
        else
            lesserY = a.getY();
        this.center = new Point(Math.abs(c.getX() - a.getX()) / 2 + lesserX,
                Math.abs(c.getY() - a.getY()) / 2 + lesserY);
        //дальше немного геометрической магии, что рассчитать координаты остальных вершин
        Point relativeA = new Point(a.getX() - center.getX(), a.getY() - center.getY());
        Point relativeC = new Point(c.getX() - center.getX(), c.getY() - center.getY());
        this.b = new Point(relativeC.getY() + center.getX(), relativeA.getX() + center.getY());
        this.d = new Point(relativeA.getY() + center.getX(), relativeC.getX() + center.getY());
        this.side = new Line(a.getX(), a.getY(), b.getX(), b.getY());
        super.setArea((float) (Math.pow(side.getLength(), 2)));
        super.setCoordinates(new Point[]{a, b, c, d});
    }

    public Line getSide() {
        return side;
    }

}
