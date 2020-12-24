package com.universal;
import java.io.*;
import java.util.ArrayList;

public class UniversalMethods
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("This will be 1st array size.");
        int x = inputInt();
        System.out.println("This will be 2nd array size.");
        int y = inputInt();

        int [] a = inputIntsFromString(x);
        int[] b = inputIntsFromString(y);
        int[] c = mergeArrays(a, b);
        printIntArray(c);

    }
    public static int inputInt() throws IOException
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Введите число:");
        String s = bufferedReader.readLine();
        int x = Integer.parseInt(s);
        return x;
    }
    public static String inputString() throws IOException
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Ведите строку:");
        String str = bufferedReader.readLine();
        return str;
    }
    public static int[] inputIntsFromString(int x) throws IOException
    {
            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            System.out.printf("Ведите %d чисел в строку через пробел:\n", x);
            String str = bufferedReader.readLine();
            String[] array = str.split(" ");
            int[] intsArray = new int[x];
            for (int i=0; i<intsArray.length; i++)
            {
                intsArray[i] = Integer.parseInt(array[i]);
            }
            return intsArray;
    }
    public static void printStrArray(String[] array)
    {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
    public static void printIntArray(int[] array)
    {
        for (int j : array) System.out.println(j);
    }

    public static int[] mergeSortIntsArray(int[] array) // ASC sort
    {
        int [] sortedArray = new int[array.length];
        int [][] soSorryArray = new int[array.length][1];
        for (int i : array)
        {
            soSorryArray[i][0] = array[i];
        }

        return
    }

    public static int[] mergeArrays(int[] arrayA, int[] arrayB)
    {
        int[] result = new int[arrayA.length + arrayB.length];
        int counterA = 0;
        int counterB = 0;

        if (arrayA[0] <= arrayB[0])  //first element handling
        {
            result[0] = arrayA[0];
            counterA ++;
        }
        else
        {
            result[0] = arrayB[0];
            counterB ++;
        }


        for (int i = 1; i < result.length; i++)
        {
            if (counterA==arrayA.length && counterB == arrayB.length)
            {
                if (arrayA[arrayA.length-1] <= arrayB[arrayB.length-1])  // last element handling
                {
                    result[result.length-1] = arrayB[arrayB.length-1];
                }
                else
                {
                    result[result.length-1] = arrayA[arrayA.length-1];
                }
                break;
            }
            else if (counterA==arrayA.length && counterB != arrayB.length)
            {
                result[i] = arrayB[counterB];
                counterB++;
            }
            else if (counterB==arrayB.length && counterA != arrayA.length)
            {
                result[i] = arrayA[counterA];
                counterA++;
            }
            else
            {
                if (arrayA[counterA] <= arrayB[counterB])
                {
                    result[i] = arrayA[counterA];
                    if (counterA < arrayA.length)
                        counterA++;
                }
                else
                {
                    result[i] = arrayB[counterB];
                    if (counterB < arrayB.length)
                        counterB++;
                }
            }
        }
        return result;
    }

}
