package com.module2.referringtypes;
import java.io.*;

/* 1. Дана строка. Вывести первый, последний и средний (если он есть) символы.
Напишите программу, которая выводит часть строки до первой встреченной точки,
включая точку. Также предусмотрите вывод количества пробелов. */

public class FirstMiddleLastStringSymbol
{
    public static void main(String[] args) throws IOException
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите строку: ");
        String str = bufferedReader.readLine();

        int length = str.length();
        boolean middle = length % 2 > 0;

        String firstSym = str.substring(0, 1);
        String midSym;

        String lastSym = str.substring(length - 1, length);

        System.out.printf("Строка: %s\nПервый символ: %s\n", str, firstSym);
        if (middle)
        {
            midSym = str.substring(length / 2, length / 2 + 1);
            System.out.printf("Средний символ: %s\n", midSym);

        }
        System.out.printf("Последний символ: %s\n", lastSym);
    }
}
