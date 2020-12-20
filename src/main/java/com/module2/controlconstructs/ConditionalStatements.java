package com.module2.controlconstructs;

import com.module2.arrays.ArrayOfStringsLength;
import com.module2.arrays.MaxIntFromArray;

import java.io.*;
import java.util.Random;

public class ConditionalStatements
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("1. Ввести с клавиатуры два числа, и вывести на экран минимальное из них.");
        int x = ConditionalStatements.inputInt();
        int y = ConditionalStatements.inputInt();
        if (x>y)
            System.out.println(y);
        else if (y>x)
            System.out.println(x);
        else
            System.out.println("Числа равны");

        System.out.println("2. Ввести с клавиатуры четыре числа, и вывести максимальное из них.");
        x=ConditionalStatements.inputInt();
        y=ConditionalStatements.inputInt();
        int z=ConditionalStatements.inputInt();
        int w=ConditionalStatements.inputInt();
        int [] array1 = {x, y, z, w};
        int max = MaxIntFromArray.max(array1);
        System.out.println(max);

        System.out.println("3. Ввести с клавиатуры три числа, и вывести их в порядке убывания.");
        x=ConditionalStatements.inputInt();
        y=ConditionalStatements.inputInt();
        z=ConditionalStatements.inputInt();
        int[] unsortedArray = {x, y, z};
        int [] sortedArray = ConditionalStatements.sort(unsortedArray);
        ArrayOfStringsLength.printIntArray(sortedArray);

        System.out.println("4. Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».\n" +
                "Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».\n");
        System.out.println("Ведите первое имя:");
        String name1 = ConditionalStatements.inputString();
        System.out.println("Введите второе имя:");
        String name2 = ConditionalStatements.inputString();
        if (name1.compareTo(name2) == 0)
            System.out.println("Имена идентичны");
        else if (name1.length()==name2.length())
            System.out.println("Длины имен равны");

        System.out.println("5. Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».\n" +
                "6. Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».\n" +
                "(Решение объединено)");
        System.out.println("Введите имя:");
        String name = ConditionalStatements.inputString();
        System.out.println("Теперь возраст.");
        int age = ConditionalStatements.inputInt();
        if (age<18)
            System.out.printf("%s, подрасти еще.\n", name);
        else if (age>20)
            System.out.printf("%s, и 18-ти достаточно.\n", name);

        System.out.println("7. За семь попыток угадать число. При каждой попытке вам будет выводиться сообщение - \"Мало\" или \"Много\".\n" +
                "Если угадаете, уложившись в семь попыток, то выводится сообщение \"Угадал :)\" и программа завершает работу.\n" +
                "Eсли по истечении 7 попыток число не угадывается, то выводится сообщение \"Не угадал :(\" и завершается работа.");
        Random random = new Random();
        int secret = random.nextInt(20+1);
        System.out.println("Угадываем число от 0 до 20");
        int counter = 7;
        boolean success = false;
        while (counter>0)
        {
            int guess = ConditionalStatements.inputInt();
            if (guess == secret)
            {
                success = true;
                break;
            }
            else if (guess>secret)
                System.out.println("Много");
            else
                System.out.println("Мало");
            counter--;
            System.out.printf("Осталось попыток: %d\n", counter);
        }
        if (success)
            System.out.println("Угадал :)");
        else
            System.out.println("Не угадал :(");
    }
    public static int inputInt() throws IOException
    {
        int x;
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Введите число:");
        String s = bufferedReader.readLine();
        x = Integer.parseInt(s);
        return x;
    }
    public static String inputString() throws IOException
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = bufferedReader.readLine();
        return str;
    }
    public static int[] sort(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                if (array[j] < array[i])
                {
                    int xj = array[j];
                    int xi = array[i];
                    array[j] = xi;
                    array[i] = xj;
                }
            }
        }
        return array;
    }
}
