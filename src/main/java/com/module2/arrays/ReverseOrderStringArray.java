package com.module2.arrays;
import java.io.*;

/*-2-

Массив из строчек в обратном порядке

1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов)
на экран в обратном порядке. Каждый элемент - с новой строки
 */
public class ReverseOrderStringArray
{
    public static void main(String[] args) throws IOException
    {
        String[] array = new String[10];
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        for (int i =0; i< array.length-2; i++)
        {
            System.out.printf("Введите строку №%d:\n", i);
            array[i] = bufferedReader.readLine();
        }
        String [] newArray = reverseStrArray(array);
        printStrArray(newArray);
    }
    public static String[] reverseStrArray(String[] array)
    {
        String [] reversedArray = new String[array.length];
        for (int i = 0; i < array.length; i++)
        {
            reversedArray[i] = array[array.length-i-1];
        }
        return reversedArray;
    }
    public static void printStrArray(String[] array)
    {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
