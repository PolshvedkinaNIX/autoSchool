package com.module3.figure;
import java.io.IOException;
import java.util.Random;
/*
Задание
В функции main должны быть рeализованы следующие пункты:
- создания массива рандомных фигур размером в 10 элементов.
- сортировка фигур по площади (ASC/DESC - не важно)
- вывести отсортированный массив на консоли в виде : Имя, S=площадь
 */

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Figure[] figures = new Figure[10];
        for (int i=0; i< figures.length; i++)
        {
            Random random = new Random();
            int type = random.nextInt(2+1);
            if (type == 0)
            {
                figures[i] = randCircle();
            }
            else if (type == 1)
            {
                figures[i] = randTriangle();
            }
            else
            {
                figures[i] = randSquare();
            }
        }
        for (int i=0; i< figures.length; i++)
        {
            System.out.println(figures[i].getArea());
        }

    }
    public static Circle randCircle()
    {
        Point a = randPoint();
        Point b = randPoint();
        Circle circle = new Circle(a.getX(), a.getY(), b.getX(), b.getY());
        return circle;
    }
    public static Triangle randTriangle()
    {
        Point a;
        Point b;
        Point c;
        Line ca;
        Line ab;
        Line bc;
        do {
            a = randPoint();
            b = randPoint();
            c = randPoint();
            ab = new Line(a.getX(), a.getY(), b.getX(), b.getY());
            bc = new Line(b.getX(), b.getY(), c.getX(), c.getY());
            ca = new Line(c.getX(), c.getY(), a.getX(), a.getY());

        }
        while ((ca.getLength()>=ab.getLength()+ bc.getLength())||(ab.getLength()>= bc.getLength()+ ca.getLength())||(ab.getLength()>= bc.getLength()+ ca.getLength()));
        Triangle triangle = new Triangle(a.getX(), a.getY(), b.getX(), b.getY(), c.getX(), c.getY());
        return triangle;

    }
    public static Square randSquare()
    {
        Point a = randPoint();
        Point b = randPoint();
        Point c = randPoint();
        Point d = randPoint();
        Square square = new Square(a.getX(), a.getY(), b.getX(), b.getY(), c.getX(), c.getY(), d.getX(), d.getY());
        return square;
    }
    public static Point randPoint()
    {
        Random random = new Random();
        float x = random.nextFloat(); /// Как сюда записать рамки?
        float y = random.nextFloat();
        Point point = new Point(x,y);
        return point;
    }
}
