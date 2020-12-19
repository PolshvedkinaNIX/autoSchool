package com.module2.arrays;

import java.io.IOException;

/*
-5-

Один большой массив и два маленьких

1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
 */
public class OneBigTwoSmallArrays
{
    public static void main(String[] args) throws IOException
    {
        int[] bigArray = MaxIntFromArray.initializeArray(20);
        int[] firstSmallArray = new int[10];
        int[] secondSmallArray = new int[10];
        for (int i=0; i<firstSmallArray.length; i++)
            firstSmallArray[i]=bigArray[i];

        for (int i=0; i<secondSmallArray.length; i++)
            secondSmallArray[i]=bigArray[i+10];
        ArrayOfStringsLength.printIntArray(secondSmallArray);
    }
}


