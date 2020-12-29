package com.module4.loggingtask;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/*
Практическое задание:
Добавить в зависимости log4j2
Создать класс логики с двумя методами, один из которых будет private,
второй - public. Public метод должен вызывать private метод, оба метода должы выводить в консоль
информацию о вызове.
Создать Main класс, в котором будет вызываться public метод из предыдущего класса
Создать в resources/ файл log4j2.xml, в котором настроить вывод логов
в виде: yyyy-MM-dd HH:mm:ss
<уровень лога> <имя класса> <номер строки вызова записи в лог> <сообщение лога> в файл log_file.log
Лог должен создаватся в папке /target/log-output
Добавить логирование в класс логики
Прислать куратору log_file.log
 */
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);


    public static void main(String[] args) {
        logger.trace("Entering application.");
        Logic logic = new Logic();
        if (logic.publicMethod() == 0) {
            logger.error("Didn't do it.");
            logic.publicMethod();
            logger.error("Exiting application.");
        }
    }
}
