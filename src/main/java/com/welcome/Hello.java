package com.welcome;

public class Hello
{
    private static String name1;

    public static void setupName(String name)
    {
        // присваивает внутренней private переменной имя человека
        name1 = name;


    }
    public static void welcome()
    {
        /*
         формирует и выводит в консоль
         приветствие "Hello, %name%" (имя должно подставляться)
        */
        System.out.printf("Hello, %s\n", name1);
    }
    public static void byeBay()
    {
        // прощается с выводом в консоль фразы "Bye, %name%"
        System.out.printf("Bye, %s\n", name1);
    }


}
