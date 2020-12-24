package com.module3.figure;
import java.util.Random;
import com.universal.UniversalMethods;

public class RandomFiguresArray
{
    private int figureSize; //максимальный линейный размер фигуры
    private int shift; // это сдвиг по оси x, благодаря ему фигуры не будут пересекаться
    private int incrementedSift; // эта переменная хранит расстояние, которое увеличивается на значение сдвига с каждой новой фигурой
    public Figure [] generateRandomFiguresArray(int linearSize)
    {
        figureSize = linearSize;
        shift = figureSize + 1;
        incrementedSift = 0;

        Figure[] figures = new Figure[10];
        for (int i=0; i< figures.length; i++) //наполняем массив случайными фигурами
        {
            Random random = new Random();
            int type = random.nextInt(2+1);
            if (type == 0)
            {
                figures[i] = randCircle();
                figures[i].setName((i+1)+". "+NameGenerator.giveName()+" Circle");
            }
            else if (type == 1)
            {
                figures[i] = randTriangle();
                figures[i].setName((i+1)+". "+NameGenerator.giveName()+" Triangle");
            }
            else
            {
                figures[i] = randSquare();
                figures[i].setName((i+1)+". "+NameGenerator.giveName()+" Square");
            }
            incrementedSift = incrementedSift + shift; // важный кусок про сдвиг
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

