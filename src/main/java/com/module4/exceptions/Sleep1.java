package com.module4.exceptions;
import com.universal.UniversalMethods;

import java.io.IOException;

public class Sleep1
{
    public static void sleep1() throws IOException, InterruptedException {
        System.out.println("1. Ввести с клавиатуры два числа, и вывести на экран минимальное из них.");
        Thread.sleep(3000);
        int x = UniversalMethods.inputInt();
        int y = UniversalMethods.inputInt();

        if (x > y)
            System.out.println(y);
        else if (y > x)
            System.out.println(x);
        else
            System.out.println("Числа равны");

    }
}
