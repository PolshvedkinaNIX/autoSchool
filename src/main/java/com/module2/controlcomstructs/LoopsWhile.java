package com.module2.controlcomstructs;
import java.io.IOException;

public class LoopsWhile
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("8. Вывести на экран числа от 1 до 10, используя цикл while.");
        int counter = 1;
        while ( counter<=10)
        {
            System.out.println(counter);
            counter++;
        }
        System.out.println("9. Вывести на экран числа от 10 до 1, используя цикл while.");
        counter = 10;
        while ( counter>=1)
        {
            System.out.println(counter);
            counter--;
        }

        System.out.println("10 Ввести с клавиатуры строку и число N. Вывести на экран строку N раз, используя цикл while.");
        System.out.println("Ввведите строку:");
        String str = ConditionalStatements.inputString();
        int x = ConditionalStatements.inputInt();
        while (x>0)
        {
            System.out.println(str);
            x--;
        }

        System.out.println("11. Вывести на экран квадрат из 10х10 букв S используя цикл while. Буквы в каждой строке не разделять.");
        counter = 10;
        while ( counter>0)
        {
            int counter2 = 10;
            while ( counter2>0)
            {
                System.out.print('S');
                counter2--;
            }
            System.out.print("\n");
            counter--;
        }

        System.out.println("12 Вывести на экран таблицу умножения 10х10 используя цикл while. Числа разделить пробелом.");
        counter = 1;
        while ( counter<=10)
        {
            int counter2 = 1;
            while ( counter2<=10)
            {
                System.out.printf("%d ", counter*counter2);
                counter2++;
            }
            System.out.print("\n");
            counter++;
        }
    }
}
