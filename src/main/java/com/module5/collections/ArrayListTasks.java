package com.module5.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.universal.UniversalMethods;

public class ArrayListTasks {
    public static void main(String[] args) throws IOException, InterruptedException {

        /*
7. 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл, выведи его содержимое на экран, каждое значение с новой строки
*/


        System.out.println("Task 7.");
        List<String> list7 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list7.add("String " + (i + 1));
        }
        System.out.println(list7.size());
        for (String text : list7) {
            System.out.println(text);
        }

        /*
8. Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

        Thread.sleep(1000); //здесь и далее, чтобы вывод смотрелся лучше
        System.out.print("\nTask 8.\n");
        List<String> list8 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list8.add(UniversalMethods.inputString());
            // здесь и дальше метод из пакета universal, он переписан так, чтобы запрос повторялся, если полученная строка пустая, потому это можно не проверять
        }
        String maxString = null;
        int maxLength = 0;
        for (String text : list8) {
            if (text.length() > maxLength) { // поиск первой строки максимальной длины
                maxLength = text.length();
                maxString = text;
            }
        }
        System.out.println(maxString);
        for (String text : list8) {
            if ((text.length() == maxLength) && (!Objects.equals(text, maxString))) { // поиск следующих строк с максимальной длиной
                System.out.println(text);
            }
        }

        /*
9. Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки
*/

        Thread.sleep(1000);
        System.out.print("\nTask 9.\n");
        List<String> list9 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list9.add(UniversalMethods.inputString());
        }
        String minString = null;
        int minLength = 1;
        for (String text : list9) {
            if (text.length() <= minLength) { // поиск первой самой маленькой строки
                minLength = text.length();
                minString = text;
            }
        }
        System.out.println(minString);
        for (String text : list9) {
            if ((text.length() == minLength) && (!text.equals(minString))) { // оиск остальных строк минимальной длины
                System.out.println(text);
            }
        }

        /*
10. 10 строчек в начало списка
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.
*/

        Thread.sleep(1000);
        System.out.print("\nTask 10.\n");
        List<String> list10 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list10.add(0, UniversalMethods.inputString());
        }
        for (String str : list10) {
            System.out.println(str);
        }

        /*
11. Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл, выведи содержимое на экран, каждое значение с новой строки
*/

        Thread.sleep(1000);
        System.out.print("\nTask 11.\n");
        List<String> list11 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list11.add(UniversalMethods.inputString());
        }
        for (int i = 0; i < 13; i++) {
            String lastStr = list11.get(list11.size() - 1);
            list11.remove(list11.size() - 1);
            list11.add(0, lastStr);
        }
        for (String s : list11) {
            System.out.println(s);
        }
    }
}