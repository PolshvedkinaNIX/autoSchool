package com.module2.typeconversions;
import java.io.*;

/*3 В переменной n хранится вещественное число с ненулевой дробной частью.
Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
 */

import java.io.IOException;

public class Rounding
{
    public static void main(String[] args)throws IOException
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Input n: ");
        String sN = bufferedReader.readLine();
        float n = Float.parseFloat(sN);
        int intN = (int) n;
        float fraction = n - intN;
        int roundedN;
        if (fraction >= 0.5)
            roundedN = intN + 1;
        else
            roundedN = intN;

        System.out.printf("При округлении %f получается %d\n", n, roundedN);
    }
}
