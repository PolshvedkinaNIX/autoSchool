package com.module5.collections;
import com.universal.RandomGenerator;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;
import com.universal.UniversalMethods;


public class SetAndMapTasks {
    public static void main(String[] args) throws IOException, InterruptedException{
        /*
12. Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/
        System.out.println("Task 12.");
        Set<String> set12 = new HashSet<>();
        String[] array12 = new String[]{
                "лава", "любовь", "лед", "лаванда", "лес",
                "литр", "лист", "лом", "лицо", "лисица",
                "лакей", "лакрица", "лак", "лама", "лампа",
                "лень", "ливень", "линька", "лейка", "ластик"};
        Collections.addAll(set12, array12);
        for (String s: set12){
            System.out.println(s);
        }
        /*
13. Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/
        Thread.sleep(1000); //здесь и далее, чтобы вывод смотрелся лучше
        System.out.printf("\nTask 13.\n");
        Set<Integer> set13 = new HashSet<>();
        Random random = new Random(6);
        for (int i=0; i<20; i++){
            int value;
            do {
                value= random.nextInt(30 + 1);
            }while (set13.contains(value));
            set13.add(value);
        }
        System.out.println("Сет до удаления содержит:");
        for (Integer s: set13){
            System.out.println(s);
        }
        Set<Integer> bigSet = new HashSet<>();
        for (Integer i: set13){
            if (i>10){
                bigSet.add(i);
            }
        }
        set13.removeAll(bigSet);
        System.out.println("Сет после удаления содержит:");
        for (Integer s: set13){
            System.out.println(s);
        }
        /*
14. Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя». Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/
        Thread.sleep(1000);
        System.out.printf("\nTask 14.\n");
        Map<String, String> map14 = new HashMap<>();
        for (int i = 0; i<10; i++){
            String secondName;
            do {
                secondName = RandomGenerator.giveSecondName();
            }while (map14.containsKey(secondName));
            map14.put(secondName, RandomGenerator.giveName());
        }
        String soughtName = UniversalMethods.inputString();
        int firstNameCounter = 0;
        int secondNameCounter = 0;
        if (map14.containsKey(soughtName)){
            secondNameCounter++; // поскольку ключи уникальные, больше одного повтора в принципе быть не может
        }
        Iterator<Map.Entry<String, String>> iterator14 = map14.entrySet().iterator();
        while (iterator14.hasNext()) {
            Map.Entry<String, String> pair = iterator14.next();
            String value = pair.getValue();
            if (Objects.equals(value, soughtName)){
                firstNameCounter++;
            }
        }
        System.out.println(soughtName+" содержится в "+firstNameCounter+" именах и в "+secondNameCounter+" фамилиях.");
        UniversalMethods.printHashMap(map14);
/*
15. Создать словарь (Map<String, LocalDate>) и занести в него десять записей по принципу: «фамилия» - «дата рождения». Удалить из словаря всех людей, родившихся летом.
*/
        Thread.sleep(1000);
        System.out.printf("\nTask 15.\n");
        Map<String, LocalDate> map15 = new HashMap<>();
        for (int i =0; i< 10; i++){
            String secondName;
            do {
                secondName = RandomGenerator.giveSecondName();
            }while (map15.containsKey(secondName));
            map15.put(secondName, RandomGenerator.giveDate());
        }
        Set<String> summerPeople = new HashSet<>();
        Iterator<Map.Entry<String, LocalDate>> iterator15 = map15.entrySet().iterator();
        while (iterator15.hasNext()) {
            Map.Entry<String, LocalDate> pair = iterator15.next();
            String key = pair.getKey();
            LocalDate value = pair.getValue();
            if (value.getMonthValue()==7 || value.getMonthValue()==8 ||value.getMonthValue()==6){
                summerPeople.add(key);
            }
        }
        System.out.println("Словарь до удаления рожденных летом:");
        UniversalMethods.printHashMap(map15);
        for (String key: summerPeople){
            map15.remove(key);
        }
        System.out.println("Словарь после удаления рожденных летом:");
        UniversalMethods.printHashMap(map15);
/*
16. Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя». Удалить людей, имеющих одинаковые имена.
*/
        Thread.sleep(1000);
        System.out.printf("\nTask 16.\n");
        Map<String, String> map16 = new HashMap<>();
        for (int i=0; i<7; i++){
            String secondName;
            do {
                secondName = RandomGenerator.giveSecondName();
            }while (map16.containsKey(secondName));
            map16.put(secondName, RandomGenerator.giveName());
        }
        for (int i=0; i<3; i++){
            String secondName;
            do {
                secondName = RandomGenerator.giveSecondName();
            }while (map16.containsKey(secondName));
            map16.put(secondName, "Repeated Name");
        }
        Set<String> names = new HashSet<>();
        Set<String> forRemoving = new HashSet<>();
        Iterator<Map.Entry<String, String>> iterator16 = map16.entrySet().iterator();
        while (iterator16.hasNext()) {
            Map.Entry<String, String> pair = iterator16.next();
            String key = pair.getKey();
            String value = pair.getValue();
            if (names.contains(value)) {
                forRemoving.add(key);
            }
            names.add(value);
        }
        System.out.println("Словарь до удаления записей с повторами имён:");
        UniversalMethods.printHashMap(map16);
        for (String key: forRemoving){
            map16.remove(key);
        }
        System.out.println("Словарь после удаления записей с повторами имён:");
        UniversalMethods.printHashMap(map16);
/*
17.
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями. Обратить внимание на количество записей в получившейся коллекции.
4. Вывести содержимое Map на экран.
 */
        Thread.sleep(1000);
        System.out.printf("\nTask 17.\n");
        Map<String, String> map17 = new HashMap<>();
        for (int i=0; i<6; i++){
            String secondName;
            do {
                secondName = RandomGenerator.giveSecondName();
            }while (map17.containsKey(secondName));
            map17.put(secondName, RandomGenerator.giveName());
        }
        for (int i=0; i<3; i++){
            map17.put("Repeated Second Name", "Repeated Name"); //повторяющиеся фамилии и имена
        }
        map17.put("Original Second Name", "Repeated Name"); //повторяющееся имя но оригинальная фамилия
        UniversalMethods.printHashMap(map17);
        //ключи должны иметь неповторяющиеся значения, потому в выводе не может быть одинаковых фамилий
    }
}
