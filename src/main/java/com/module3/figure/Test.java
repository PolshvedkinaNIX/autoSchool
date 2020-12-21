package com.module3.figure;
import com.module2.controlconstructs.ConditionalStatements;
import java.io.IOException;
import java.util.Random;

public class Test
{
    public static void main(String[] args) throws IOException
    {
        Random random = new Random();
        int x = ConditionalStatements.inputInt();
        for (int i = 0; i<x; i++)
        {
            int type = random.nextInt(3+1);
            System.out.println(type);
        }

    }
}
