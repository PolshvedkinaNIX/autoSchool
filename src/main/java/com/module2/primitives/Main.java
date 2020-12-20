package com.module2.primitives;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.printf("Hello, %s!",name);
    }


}
