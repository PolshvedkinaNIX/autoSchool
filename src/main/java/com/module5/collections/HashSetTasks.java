package com.module5.collections;
import com.universal.RandomGenerator;
import java.util.*;

public class HashSetTasks {
    public static void main(String[] args) throws InterruptedException {/*
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
        }/* у меня порядок изменился на:
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

2. HashMap из 10 пар

Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
картофель – клубень*/
        Thread.sleep(1000); //здесь и далее, чтобы вывод смотрелся лучше
        System.out.printf("\nTask 2.\n");
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
        }/*
3. Коллекция HashMap из котов

Есть класс Cat, с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.*/
        Thread.sleep(1000);
        System.out.printf("\nTask 3.\n");
        Map<String, Cat> cats3 = new HashMap<>(10);
        for (int i = 0; i < 10; i++){
            String name = RandomGenerator.giveName()+" "+(i+1);
            cats3.put(name, new Cat(name));
        }
        Iterator<Map.Entry<String, Cat>> iterator3 = cats3.entrySet().iterator();
        while (iterator3.hasNext()) {
            Map.Entry<String, Cat> pair = iterator3.next();
            String key = pair.getKey();
            Cat value = pair.getValue();
            System.out.println(key + " " + value);
        }/*
4. Вывести на экран список ключей

Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список ключей, каждый элемент с новой строки.*/
        Thread.sleep(1000);
        System.out.printf("\nTask 4.\n");
        Map<String, String> strings4 = new HashMap<>();
        for (int i = 0; i < 10; i++){
            strings4.put("Ключ "+i, "Значение "+i);
        }
        Iterator<Map.Entry<String, String>> iterator4 = strings4.entrySet().iterator();
        while (iterator4.hasNext()) {
            Map.Entry<String, String> pair = iterator4.next();
            String key = pair.getKey();
            System.out.println(key);
        }/*
5. Вывести на экран список значений

Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список значений, каждый элемент с новой строки.*/
        Thread.sleep(1000);
        System.out.printf("\nTask 5.\n");
        Map<String, String> strings5 = new HashMap<>();
        for (int i = 0; i < 10; i++){
            strings5.put("Другой ключ "+i, "Другое значение "+i);
        }
        Iterator<Map.Entry<String, String>> iterator5 = strings5.entrySet().iterator();
        while (iterator5.hasNext()) {
            Map.Entry<String, String> pair = iterator5.next();
            String value = pair.getValue();
            System.out.println(value);
        }/*
6. Коллекция HashMap из Object

Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
Sim - 5*/
        Thread.sleep(1000);
        System.out.printf("\nTask 6.\n");
        Random random = new Random();
        Map<String, Object> map6 = new HashMap<>();
        for (int i = 0; i < 10; i++){
            map6.put("Строка-ключ "+i, random.nextInt());
        }
        Iterator<Map.Entry<String,Object>> iterator6 = map6.entrySet().iterator();
        while (iterator6.hasNext()) {
            Map.Entry<String, Object> pair = iterator6.next();
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }
}
/*
    public static <T extends Object & Set> void addFromArrayToSet(String[] array, T set){
        for (String str: array) {
            set.add(str);
        } //TODO: компилятор подсветил мне, что в этом методе непроверенный вызов add(E) у raw типа, я бы хотела понять, что это значит
    }*/
