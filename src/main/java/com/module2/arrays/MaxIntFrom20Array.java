package com.module2.arrays;
import java.io.*;

/*-1- Максимальное среди массива на 20 чисел

        1. В методе initializeArray():
        1.1. Создайте массив на 20 чисел
        1.2. Считайте с консоли 20 чисел и заполните ими массив
        2. Метод max(int[] array) должен находить максимальное
        число из элементов массива
*/
public class MaxIntFrom20Array
{
    static int intArray[];
    public static void main(String[] args) throws IOException
    {
        MaxIntFrom20Array.initializeArray();
        int max = MaxIntFrom20Array.max(intArray);
        System.out.printf("Самое большое число: %d\n", max);
    }

    public static void initializeArray() throws IOException
    {
        intArray = new int[20];
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        for (int i =0; i< intArray.length; i++)
        {
            System.out.printf("Введите число №%d:\n", i);
            String s = bufferedReader.readLine();
            intArray[i] = Integer.parseInt(s);
        }
    }

    public static int max(int[] array)
    {
        int max = 0;

        for (int i=0; i<array.length; i++)
        {
            if (array[i]>=max)
                max = array[i];
        }
        return max;
    }
}
