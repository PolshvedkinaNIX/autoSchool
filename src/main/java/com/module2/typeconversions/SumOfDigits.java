package com.module2.typeconversions;
import java.io.*;

/* 2 В переменной n хранится натуральное двузначное число.
Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n. */

public class SumOfDigits
{
    public static void main(String[] args)throws IOException
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Input n: ");
        String sN = bufferedReader.readLine();
        int n = Integer.parseInt(sN);
        int dozens = n/10;
        int units = n - dozens*10;
        int sumOfDigits = dozens + units;
        System.out.printf("Сумма цифр %d равна %d\n", n, sumOfDigits);
    }
}
