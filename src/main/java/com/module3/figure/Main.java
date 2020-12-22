package com.module3.figure;
import java.util.Random;
import com.universal.UniversalMethods;
/*
Задание
В функции main должны быть рeализованы следующие пункты:
- создания массива рандомных фигур размером в 10 элементов.
- сортировка фигур по площади (ASC/DESC - не важно)
- вывести отсортированный массив на консоли в виде : Имя, S=площадь
 */

public class Main
{
    static int shift; //этот хук нужно потом убрать
    static int figureSize;
    public static void main(String[] args) throws Exception
    {
        System.out.println("Введите сдвиг."); //убрать
        shift = UniversalMethods.inputInt();// убрать
        System.out.println("Введите размер фигуры");
        figureSize = UniversalMethods.inputInt();

        Figure[] figures = new Figure[10];
        for (int i=0; i< figures.length; i++)
        {
            Random random = new Random();
            int type = random.nextInt(2+1);
            if (type == 0)
            {
                figures[i] = randCircle();
                figures[i].setName((i+1)+" "+NameGenerator.giveName()+" Circle");
            }
            else if (type == 1)
            {
                figures[i] = randTriangle();
                figures[i].setName((i+1)+" "+NameGenerator.giveName()+" Triangle");
            }
            else
            {
                figures[i] = randSquare();
                figures[i].setName((i+1)+" "+NameGenerator.giveName()+" Square");
            }
            shift = shift *2; // важный кусок про сдвиг

        }
        for (int i=0; i< figures.length; i++)
        {
            System.out.printf("%s s = %.2f\n", figures[i].getName(), figures[i].getArea());
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
        Square square = new Square(a.getX(), a.getY(), b.getX(), b.getY());
        return square;
    }
    public static Point randPoint()
    {
        Random random = new Random();
        //float x = (random.nextFloat()+random.nextInt(size+1)); /// Как сюда записать рамки?
        //float y = (random.nextFloat()+random.nextInt(size+1));
        float x = (float)random.nextInt(figureSize+1)+random.nextFloat()+ shift; //
        float y = (float)random.nextInt(figureSize+1)+random.nextFloat()+ shift; //
        Point point = new Point(x,y);
        return point;
    }

}
