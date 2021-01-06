package com.module3.figure;

public class Square extends Figure {
    private final Point a;
    private Point b;
    private final Point c;
    private Point d;
    private Line side;
    private Point center;

    public Square(Point a, Point c) // constructor
    {
        this.a = a;//конструктор по двум точкам, используется диагональ, а не сторона, тк только диагональ задает квадрат однозначно (по стороне можно построить 2 квадрата, площадь которых идентична, но положение отличается)
        this.c = c;
        this.center = getCenter(a, c);
        setBDPoints(a,c);
        this.side = new Line(a, b);
        setArea();
        setCoordinates(new Point[]{a, b, c, d});
    }
    private Point getCenter(Point a, Point c){
        float lesserX = Math.min(a.getX(), c.getX());
        float lesserY = Math.min(a.getY(), c.getY());
        return center = new Point(Math.abs(c.getX() - a.getX()) / 2 + lesserX,
                Math.abs(c.getY() - a.getY()) / 2 + lesserY);
    }
    private void setBDPoints(Point a, Point c){

        Point relativeA = new Point(a.getX() - center.getX(), a.getY() - center.getY());
        Point relativeC = new Point(c.getX() - center.getX(), c.getY() - center.getY());
        this.b = new Point(relativeC.getY() + center.getX(), relativeA.getX() + center.getY());
        this.d = new Point(relativeA.getY() + center.getX(), relativeC.getX() + center.getY());
    }
    @Override
    public void setArea(){
        super.setArea((float) (Math.pow(side.getLength(), 2)));
    }
    public Line getSide() {
        return side;
    }

}
