package com.universal;
import java.io.*;

public class UniversalMethods
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("This will ba array size.");
        int x = inputInt();
        System.out.println(x);
        String s = inputString();
        System.out.println(s);
        int [] a = inputIntsFromString(x);
        printIntArray(a);

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

}
