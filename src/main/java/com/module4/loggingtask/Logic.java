package com.module4.loggingtask;

public class Logic
{
    private int privateMethod()
    {
        System.out.println("This is private Hello");
        return 0;
    }
    public int publicMethod()
    {
        return privateMethod();
    }
}
