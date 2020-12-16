package com.module2.primitives;
import com.welcome.Hello;
import java.util.Scanner;

public class Main2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = in.nextLine();

        Hello.setupName(name);
        Hello.welcome();
        System.out.println("Hello, world!");
        Hello.byeBay();
    }
}
