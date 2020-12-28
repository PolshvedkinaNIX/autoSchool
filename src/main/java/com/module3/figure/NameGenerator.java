package com.module3.figure;

import java.util.Random;

public class NameGenerator {
    public static String giveName() {
        Random random = new Random();
        String[] names = new String[]{"Vasia", "Petrovich", "Anita", "Inna", "Jenja", "Patrick", "Us Boyarskogo",
                "Constancia", "Benedict", "Sveta", "Leha", "Dasha", "Gleb", "Grisha"};
        int x = random.nextInt((names.length - 1) + 1);
        return names[x];
    }
}
