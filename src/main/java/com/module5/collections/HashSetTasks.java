package com.module5.collections;
import com.module3.figure.NameGenerator;

import java.util.*;

public class HashSetTasks {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. HashSet из растений

Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
         */
        System.out.println("Task 1.");
        Set<String> set1 = new HashSet<>();
        String[] plants = new String[]{"арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"};
        Collections.addAll(set1, plants);
        //addFromArrayToSet(plants, set1);
        for (String text : set1) {
            System.out.println(text);
        }
        /* у меня порядок изменился на:
дыня
ежевика
банан
арбуз
груша
картофель
земляника
ирис
вишня
жень-шень
         */
/*
2. HashMap из 10 пар

Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
картофель – клубень
*/
        Thread.sleep(1000); //здесь и далее, чтобы вывод смотрелся лучше
        System.out.println("Task 2.");
        Map<String, String> map2 = new HashMap<>();
        String[] keys2 = new String[]{"арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"};
        String[] values2 = new String[]{"ягода", "трава", "ягода", "фрукт", "овощ", "куст", "корень", "ягода", "цветок", "клубень"};
        //Collections.addAll(keys2, values2, map2);
        for (int i = 0; i < keys2.length; i++) {
            map2.put(keys2[i], values2[i]);
        }
        Iterator<Map.Entry<String, String>> iterator = map2.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + "-" + value);
        }
        /*
3. Коллекция HashMap из котов

Есть класс Cat, с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
*/
        Thread.sleep(1000);
        System.out.println("Task 3.");
        Map<String, Cat> cats3 = new HashMap<>(10);
        int counter = 1;
        Cat[] catsArray = new Cat[10];
        Cat cat0 = new Cat(NameGenerator.giveName()+counter);
        catsArray[0] = cat0;
        counter ++;
        Cat cat1 = new Cat(NameGenerator.giveName()+counter);
        catsArray[1] = cat1;
        counter ++;
        Cat cat2 = new Cat(NameGenerator.giveName()+counter);
        catsArray[2] = cat2;
        counter ++;
        Cat cat3 = new Cat(NameGenerator.giveName()+counter);
        catsArray[3] = cat3;
        counter ++;
        Cat cat4 = new Cat(NameGenerator.giveName()+counter);
        catsArray[4] = cat4;
        counter ++;
        Cat cat5 = new Cat(NameGenerator.giveName()+counter);
        catsArray[5] = cat5;
        counter ++;
        Cat cat6 = new Cat(NameGenerator.giveName()+counter);
        catsArray[6] = cat6;
        counter ++;
        Cat cat7 = new Cat(NameGenerator.giveName()+counter);
        catsArray[7] = cat7;
        counter ++;
        Cat cat8 = new Cat(NameGenerator.giveName()+counter);
        catsArray[8] = cat8;
        counter ++;
        Cat cat9 = new Cat(NameGenerator.giveName()+counter);
        catsArray[9] = cat9;
        //это кошмар
        counter=0;

        //пока не работает
        Iterator<Map.Entry<String, Cat>> iterator3 = cats3.entrySet().iterator();
        while (iterator3.hasNext()) {
            cats3.put(catsArray[counter].getName(), catsArray[counter]);
            counter++;
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " " + value);
        }

        /*

4. Вывести на экран список ключей

Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список ключей, каждый элемент с новой строки.

5. Вывести на экран список значений

Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список значений, каждый элемент с новой строки.

6. Коллекция HashMap из Object

Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
Sim - 5
 */
    }
}
    /*
    public static <T extends Object & Set> void addFromArrayToSet(String[] array, T set){
        for (String str: array) {
            set.add(str);
        } //TODO: компилятор подсветил мне, что в этом методе непроверенный вызов add(E) у raw типа, я бы хотела понять, что это значит
    }
     */
