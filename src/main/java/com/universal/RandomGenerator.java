package com.universal;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;


public class RandomGenerator {
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
                "White", "Blabla", "Ui", "Cat", "Figure",
                "Vasia", "Petrovich", "Anita", "Inna", "Jenja",
                "Patrick", "Us Boyarskogo", "Constancia", "Benedict", "Sveta",
                "Leha", "Dasha", "Gleb", "Grisha", "Andersen"};
        int x = random.nextInt((secondNames.length - 1) + 1);
        return secondNames[x];
    }
    public static LocalDate giveDate(){
        Random random = new Random();
        LocalDate randomDate;
        LocalDate now = LocalDate.now();

        int year = random.nextInt((now.getYear()-1) + 1);
        int month = random.nextInt(11 + 1) + 1; //+1 потому, что нулевого месяца не бывает
        Integer[] bigMonth = new Integer[]{1, 3, 5, 7, 8, 10, 12};
        Set<Integer> bigMonthSet = new HashSet<>();
        Collections.addAll(bigMonthSet, bigMonth);
        Integer[] lesserMonth = new Integer[]{4, 6, 9, 11};
        int daysInMonth;
        if (bigMonthSet.contains(month)){
            daysInMonth = 30;
        }
        else if (month == 2){
            daysInMonth = 27;
        }
        else
            daysInMonth= 29;
        int day = random.nextInt(daysInMonth + 1) + 1;
        randomDate = LocalDate.of(year, month, day);
        return randomDate;
    }
}
