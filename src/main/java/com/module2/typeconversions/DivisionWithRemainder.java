package com.module2.typeconversions;
import java.io.*;
/*
В переменных q и w хранятся два натуральных числа. Создайте программу,
выводящую на экран результат деления q на w с остатком.
Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8):
21 / 8 = 2 и 5 в остатке
*/

public class DivisionWithRemainder
{
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Input q: ");
        String sQ = bufferedReader.readLine();
        System.out.println("Input w: ");
        String sW = bufferedReader.readLine();
        int q = Integer.parseInt(sQ);
        int w = Integer.parseInt(sW);
        int quotient = q / w;
        int remainder = q - quotient*w;

        System.out.printf("%d / %d = %d и %d в остатке\n", q, w, quotient, remainder);
    }
}
