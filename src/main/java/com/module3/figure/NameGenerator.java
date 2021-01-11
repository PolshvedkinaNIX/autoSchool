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
    public static String giveSecondName(){
        Random random = new Random();
        String[] secondNames = new String[]{
                "Ivanov", "Petrov", "Smith", "Brown", "Black",
                "Sidorov", "Stalin", "Bond", "Svetlov", "Li",
                "White", "Blabla", "Ui", "Cat", "Figure"};
        int x = random.nextInt((secondNames.length - 1) + 1);
        return secondNames[x];
    }
}
