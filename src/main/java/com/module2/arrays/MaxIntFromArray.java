package com.module2.arrays;
import java.io.*;

/*-1- Максимальное среди массива на 20 чисел

        1. В методе initializeArray():
        1.1. Создайте массив на 20 чисел
        1.2. Считайте с консоли 20 чисел и заполните ими массив
        2. Метод max(int[] array) должен находить максимальное
        число из элементов массива
*/
public class MaxIntFromArray
{
    public static void main(String[] args) throws IOException
    {
        int[] intArray = initializeArray(20);
        int max = max(intArray);
        System.out.printf("Самое большое число: %d\n", max);
    }
    public static int[] initializeArray(int arrayLength) throws IOException
    {
        int[] array = new int[arrayLength];
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        for (int i =0; i< array.length; i++)
        {
            System.out.printf("Введите число №%d:\n", i);
            String s = bufferedReader.readLine();
            array[i] = Integer.parseInt(s);
        }
        return array;
    }
    public static int max(int[] array)
    {
        int max = 0;

        for (int j : array)
        {
            if (j >= max)
                max = j;
        }
        return max;
    }
}
