package com.module5.collections;
import com.module3.figure.NameGenerator;
import java.io.IOException;
import java.util.*;
import com.universal.UniversalMethods;


public class SetAndMapTasks {
    public static void main(String[] args) throws IOException, InterruptedException{/*
12. Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».*/
        Set<String> set12 = new HashSet<>();
        String[] array12 = new String[]{
                "лава", "любовь", "лед", "лаванда", "лес",
                "литр", "лист", "лом", "лицо", "лисица",
                "лакей", "лакрица", "лак", "лама", "лампа",
                "лень", "ливень", "линька", "лейка", "ластик"};
        Collections.addAll(set12, array12);/*
13. Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.*/
        Set<Integer> set13 = new HashSet<>();
        Random random = new Random(6);
        for (int i=0; i<20; i++){
            int value;
            do {
                value= random.nextInt(20 + 1);
            }while (set13.contains(value));
            set13.add(value);
        }
        Set<Integer> bigSet = new HashSet<>();
        for (Integer i: set13){
            if (i>10){
                bigSet.add(i);
            }
        }
        set13.removeAll(bigSet);
        /*
14. Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя». Проверить сколько людей имеют совпадающие с заданным имя или фамилию.*/
        Map<String, String> map14 = new HashMap<>();
        for (int i = 0; i<10; i++){
            String secondName;
            do {
                secondName = NameGenerator.giveSecondName();
            }while (map14.containsKey(secondName));
            map14.put(secondName, NameGenerator.giveName());
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
            String key = pair.getKey();
            System.out.println(key + " " + value);
            if (Objects.equals(value, soughtName)){
                firstNameCounter++;
            }
        }
        System.out.println(soughtName+" содержится в "+firstNameCounter+" именах и в "+secondNameCounter+" фамилиях.");
/*
15. Создать словарь (Map<String, LocalDate>) и занести в него десять записей по принципу: «фамилия» - «дата рождения». Удалить из словаря всех людей, родившихся летом.
16. Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя». Удалить людей, имеющих одинаковые имена.
17.

1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями. Обратить внимание на количество записей в получившейся коллекции.
4. Вывести содержимое Map на экран.
 */
    }
}
