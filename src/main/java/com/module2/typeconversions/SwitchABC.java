package com.module2.typeconversions;
import java.io.*;

/*4 Даны три переменные a, b и c. Изменить значения этих переменных так,
чтобы в a хранилось значение a+b, в b хранилась разность старых значений c−a,
а в c хранилось сумма старых значений a+b+c. Например, a=0, b=2, c=5,
тогда новые значения a=2, b=5 и c=7.
 */

public class SwitchABC
{
    public static void main(String[] args)throws IOException
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Input a: ");
        String sA = bufferedReader.readLine();
        double a = Double.parseDouble(sA);
        System.out.println("Input b: ");
        String sB = bufferedReader.readLine();
        double b = Double.parseDouble(sB);
        System.out.println("Input c: ");
        String sC = bufferedReader.readLine();
        double c = Double.parseDouble(sC);

        double aNew = a + b;
        double bNew = c - a;
        double cNew = a + b + c;

        System.out.printf("Старые значения: a = %f, b = %f, c = %f\n", a, b, c);
        a = aNew;
        b = bNew;
        c = cNew;

        System.out.printf("Новые значения: a = a + b = %f, b = c - a = %f, c = a + b + c = %f\n", a, b, c);
    }
}
