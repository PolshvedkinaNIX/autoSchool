package com.module3.figure;

import java.util.Random;

public class NameGenerator
{
    public static String giveName()
    {
        String name;
        Random random = new Random();
        int x = random.nextInt(13+1);
        switch (x)
        {
            case 0:
                name = "Vasia";
                break;
            case 1:
                name = "Petrovich";
                break;
            case 2:
                name = "Anita";
                break;
            case 3:
                name = "Inna";
                break;
            case 4:
                name = "Jenja";
                break;
            case 5:
                name = "Patrick";
                break;
            case 6:
                name = "Us Boyarskogo";
                break;
            case 7:
                name = "Constancia";
                break;
            case 8:
                name = "Benedict";
                break;
            case 9:
                name = "Sveta";
                break;
            case 10:
                name = "Leha";
                break;
            case 11:
                name = "Dasha";
                break;
            case 12:
                name = "Gleb";
                break;
            default:
                name = "Grisha";
                break;
        }
        return name;
    }
}
