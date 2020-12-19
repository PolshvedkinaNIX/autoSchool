package com.module2.arrays;
import java.io.*;

/*-3-

2 массива

1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
5. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class ArrayOfStringsLength
{
    public static void main(String[] args) throws IOException
        {
            int [] intArray = new int[10];
            String [] strArray = initialiseStrArray(10); //method from first task
            for (int i=0; i<intArray.length; i++)
            {
                intArray[i]=strArray[i].length();
            }
            ArrayOfStringsLength.printIntArray(intArray);
        }
    public static String[] initialiseStrArray(int arrayLength) throws IOException
    {
        String[] array = new String[arrayLength];
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        for (int i =0; i< array.length; i++)
        {
            System.out.printf("Введите строку №%d:\n", i);
            array[i] = bufferedReader.readLine();
        }
        return array;
    }
    public static void printIntArray(int[] array)
    {
        for (int j : array) System.out.println(j);
    }

}
