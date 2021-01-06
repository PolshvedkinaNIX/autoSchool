package com.module3.figure;

import com.universal.UniversalMethods;

import java.util.Random;
/*
В отдельном пакете figure нужно создать структуру классов и имплементировать необходимые методы.
Должен быть базовый абстрактный класс и его наследники.
Все функции должны быть реализованы.
В классе Main с главным методом main должно быть реализовано задание.

Описание класов:
Создать структуру классов для круга, квадрата и треугольника. Каждый из них должен иметь следующие свойства (private)
и методы (public)
- имя
- координаты
- функцию получения координат
- функцию расчета площади
Задание
В функции main должны быть рeализованы следующие пункты:
- создания массива рандомных фигур размером в 10 элементов.
- сортировка фигур по площади (ASC/DESC - не важно)
- вывести отсортированный массив на консоли в виде : Имя, S=площадь
 */

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Введите максимальный линейный размер фигуры");
        int figureSize = UniversalMethods.inputInt();
        int shift = figureSize + 1;
        int incrementedSift = 0; // это сдвиг по оси x, благодаря ему фигуры не будут пересекаться

        Figure[] figures = new Figure[10];
        for (int i = 0; i < figures.length; i++) //наполняем массив случайными фигурами
        {
            Random random = new Random();
            int type = random.nextInt(2 + 1);
            if (type == 0) {
                figures[i] = new Circle(Point.randPoint(figureSize, incrementedSift), Point.randPoint(figureSize, incrementedSift));
                figures[i].setName(NameGenerator.giveName() + " Circle " + (i + 1));
            } else if (type == 1) {
                figures[i] = new Triangle(Point.randPoint(figureSize, incrementedSift), Point.randPoint(figureSize, incrementedSift),
                        Point.randPoint(figureSize, incrementedSift));
                figures[i].setName(NameGenerator.giveName() + " Triangle " + (i + 1));
            } else {
                figures[i] = new Square(Point.randPoint(figureSize, incrementedSift), Point.randPoint(figureSize, incrementedSift));
                figures[i].setName(NameGenerator.giveName() + " Square " + (i + 1));
            }
            incrementedSift = incrementedSift + shift; //сдвиг места генерации после появления каждой новой фигуры во избежание пересечений
        }
        figures = MergeSort.mergeSortFigureArray(figures);
        for (Figure figure : figures) {
            System.out.printf("%s S=%.2f\n", figure.getName(), figure.getArea());
        }
    }
}
