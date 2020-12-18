package com.module2.referringtypes;

import java.io.*;

/*
2 Найти в строке указанную подстроку и заменить ее на новую.
 Строку, ее подстроку для замены и новую подстроку вводит пользователь.
*/

public class SubstringReplacement
{
    public static void main(String[] args) throws IOException
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите строку: ");
        String str = bufferedReader.readLine();
        System.out.println("Введите подстроку, которую хотите заменить: ");
        String subStr = bufferedReader.readLine();
        boolean c = str.contains(subStr);
        if (!c)
            System.out.printf("Строка %s не содержит подстроку %s\n", str, subStr);
        else
        {
            System.out.printf("Введите подстроку, на которую замените %s\n", subStr);

            String newSubStr = bufferedReader.readLine();
            String[] strParts = str.split(subStr);

            boolean startCheck = str.startsWith(subStr);
            boolean endCheck = str.endsWith(subStr);

            if (startCheck)
                {
                    System.out.printf("%s", newSubStr);
                }

            int length = strParts.length;

            for (int i = 0; i < length - 1; i++)
                {
                    System.out.printf("%s%s", strParts[i], newSubStr);
                }
            System.out.printf("%s", strParts[length - 1]);

            if (endCheck)
                    System.out.printf("%s\n", newSubStr);
        }
    }
}
