package com.module2.arrays;

import java.io.IOException;

/*
-4-

Массив из чисел в обратном порядке

1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить
с новой строки.
*/
public class ReverseOrderIntsArray
{
    public static void main(String[] args) throws IOException
    {
        int[] intArray = MaxIntFromArray.initializeArray(10);
        int[] reversedIntArray = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++)
        {
            reversedIntArray[i] = intArray[intArray.length-i-1];
        }
        ArrayOfStringsLength.printIntArray(reversedIntArray); //method from third task
    }
}
