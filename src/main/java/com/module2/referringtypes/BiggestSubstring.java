package com.module2.referringtypes;
import java.io.*;

//3 Вводится строка слов, разделенных пробелами.
// Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.

public class BiggestSubstring
{
    public static void main(String[] args) throws IOException
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите строку: ");
        String str = bufferedReader.readLine();
        String space = " ";
        String[] strParts = str.split(space);
        int length = strParts.length;
        int biggestSubstrIndex = 0;
        int biggestSubstrLength = 0;

        for (int i = 0; i<length; i++)
        {

            if (strParts[i].length() >= biggestSubstrLength)
            {
                biggestSubstrIndex = i;
                biggestSubstrLength = strParts[i].length();
            }
        }
        System.out.printf("Самое длинное слово: %s\n", strParts[biggestSubstrIndex]);
    }
}
