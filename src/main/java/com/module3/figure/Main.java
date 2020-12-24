package com.module3.figure;
import com.universal.UniversalMethods;
/*
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
