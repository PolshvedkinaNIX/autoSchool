package com.module3.figure;
import com.universal.UniversalMethods;
/*
В отдельном пакете figur нужно создать структуру классов и имплементировать необходимые методы.
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
        System.out.println("Введите размер фигуры");
        int figureSize = UniversalMethods.inputInt();
        RandomFiguresArray random = new RandomFiguresArray();
        Figure [] figures = random.generateRandomFiguresArray(figureSize);
         figures = MergeSort.mergeSortFigureArray(figures);
        for (Figure figure : figures) {
            System.out.printf("%s S=%.2f\n", figure.getName(), figure.getArea());
        }
    }
}
