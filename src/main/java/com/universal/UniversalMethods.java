package com.universal;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static com.module3.figure.MergeSort.mergeSortFloatsArray;
/*
Это вспомогательный класс
 */

public class UniversalMethods
{
    public static void main(String[] args) throws IOException // for tests
    {
        System.out.println("This will be floats array size.");
        int x = inputInt();

        float [] a = inputFloatsFromString(x);
        float[] c = mergeSortFloatsArray(a);
        printFloatArray(c);

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
        String str;
        do {
            System.out.println("Ведите непустую строку:");
            str = bufferedReader.readLine();
        }while (str.length()<1);

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
    public static float[] inputFloatsFromString(int x) throws IOException
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.printf("Ведите %d чисел в строку через пробел:\n", x);
        String str = bufferedReader.readLine();
        String[] array = str.split(" ");
        float[] intsArray = new float[x];
        for (int i=0; i<intsArray.length; i++)
        {
            intsArray[i] = Float.parseFloat(array[i]);
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
    public static void printFloatArray(float[] array)
    {
        for (float j : array) System.out.println(j);
    }

    public static <K, V>void printHashMap(Map<K, V> map){
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> pair = iterator.next();
            K key = pair.getKey();
            V value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }

}