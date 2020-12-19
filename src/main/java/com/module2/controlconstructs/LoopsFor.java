package com.module2.controlconstructs;
import java.io.IOException;

public class LoopsFor
{
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("13. Используя цикл for вывести на экран чётные числа от 1 до 100 включительно. Через пробел либо с новой строки.");
        for (int i = 2; i<=100; i = i+2)
            System.out.println(i);

        System.out.println("14. Ввести с клавиатуры два числа m и n. Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.");
        int m = ConditionalStatements.inputInt();
        int n = ConditionalStatements.inputInt();
        for (int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                System.out.print(8);
            }
            System.out.print("\n");
        }

        System.out.println("15. Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.");
        n = 10;
        for (int i = 0; i<n; i++)
        {
            for (int j = 0; j<=i; j++)
            {
                System.out.print(8);
            }
            System.out.print("\n");
        }
        System.out.println("16. Используя цикл for вывести на экран: \n" +
                "- горизонтальную линию из 10 восьмёрок\n" +
                "- вертикальную линию из 10 восьмёрок.");
        for (int i = 0; i<n; i++)
            System.out.print(8);
        System.out.print("\n\n");
        for (int i = 0; i<n; i++)
        {
            System.out.print(8);
            System.out.print("\n");
        }
        System.out.println("17. Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]");
        System.out.println("Введите имя:");
        String name = ConditionalStatements.inputString();
        for (int i = 0; i<n; i++)
            System.out.printf("%s любит меня.\n", name);

        System.out.println("18. Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!». \n" +
                "Программа должна уменьшать число 10 раз в секунду. ");
        for (int i = 30; i>=0; i--)
        {
            Thread.sleep(100);
            System.out.println(i);
            if (i == 0)
                System.out.println("Бум!");
        }
    }
}
