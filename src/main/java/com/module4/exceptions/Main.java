package com.module4.exceptions;
import java.io.IOException;
/*
Скопируйте любой класс с программой из предыдущих заданий.

Внутри кода в любом месте инициируйте ожидание через

Thread.sleep(); с параметром 3 секунды
Сделайте два класса. В одном реализуйте указанный код через try/catch, а в другом укажите тип генерируемого исключения при объявлении класса.

В любом месте кода вставьте строку

int zero = 5/0;
При выполнении такого кода в консоли получим исключение java.lang.ArithmeticException
Через try/catch перехватите генерируемое исключение  и замените его на текст You shall not fall!
 */

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Sleep1.sleep1();
    }
}
