package com.module3.figure;
import java.util.Random;

public class RandomFiguresArray
{
    private int figureSize; //максимальный линейный размер фигуры
    private int incrementedSift; // эта переменная хранит расстояние, которое увеличивается на значение сдвига с каждой новой фигурой
    public Figure [] generateRandomFiguresArray(int linearSize)
    {
        figureSize = linearSize;
        int shift = figureSize + 1;
        incrementedSift = 0; // это сдвиг по оси x, благодаря ему фигуры не будут пересекаться

        Figure[] figures = new Figure[10];
        for (int i=0; i< figures.length; i++) //наполняем массив случайными фигурами
        {
            Random random = new Random();
            int type = random.nextInt(2+1);
            if (type == 0)
            {
                figures[i] = randCircle();
                figures[i].setName(NameGenerator.giveName()+" Circle "+(i+1));
            }
            else if (type == 1)
            {
                figures[i] = randTriangle();
                figures[i].setName(NameGenerator.giveName()+" Triangle "+(i+1));
            }
            else
            {
                figures[i] = randSquare();
                figures[i].setName(NameGenerator.giveName()+" Square "+(i+1));
            }
            incrementedSift = incrementedSift + shift; //сдвиг места генерации после появления каждой новой фигуры во избежание пересечений
        }
        return figures;
    }
    private Point randPoint()
    {
        Random random = new Random();
        float x = (float)random.nextInt(figureSize+1)+random.nextFloat()+incrementedSift;
        // второй вызов рандома для получения дробной части
        // прибавлять incrementedSift нужно для того, чтобы каждая новая фигура отодвигалась от места генерации предыдущей на расстояние figureSize + 1, благодаря чему пересечение фигур исключено
        float y = (float)random.nextInt(figureSize+1)+random.nextFloat();
        return new Point(x,y);
    }
    private Circle randCircle()
    {
        Point a = randPoint();
        Point b = randPoint();
        return new Circle(a.getX(), a.getY(), b.getX(), b.getY());
    }
    private Triangle randTriangle()
    {
        Point a = randPoint();
        Point b = randPoint();
        Point c = randPoint();
        return new Triangle(a.getX(), a.getY(), b.getX(), b.getY(), c.getX(), c.getY());
    }
    private Square randSquare()
    {
        Point a = randPoint();
        Point b = randPoint();
        return new Square(a.getX(), a.getY(), b.getX(), b.getY());
    }
}

