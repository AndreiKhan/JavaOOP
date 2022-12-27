package HomeWork_04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Этот интерфейс подойдет только для задач
public interface Print {

    // Метод для записи всех задач в csv файл
    default void printTasksCsv() {
        // Указываем название файла и где он будет создан
        File file = new File("Tasks.csv");
        
        // Ловим ошибки при создании файла
        try{
            // Если файла не существует то он создатся или перепишется
            if (file.createNewFile()) {
                System.out.println("Файл csv со всеми задачами создан");
            }
        } catch(IOException e) {
            // Выведем в консоли сообщение если вдруг ошибка
            System.out.println("Ошибка");
        }
        
        // Ловим ошибки при создании "Ручки"
        try{
            // Создаем "Ручку"
            FileWriter writer = new FileWriter(file);

            // Хитрим в создании csv файла, сначала пишем шапку
            writer.write("Приорите задачи;Задача;Описание;Дата получения;Срок сдачи;Подпись\n");
            
            // Проходим по всем задачам и выводим их информаци в нужном формате, также схитрив использую обычную запись
            for (Task item : Task.getTasks()) {
                writer.write(item.work + ";" +
                             item.prior + ";" +
                             item.description + ";" +
                             item.dayTask + ";" +
                             item.deadLine + ";" +
                             item.sign + "\n");
            }
            
            // закроем "Ручку"
            writer.close();

        } catch(IOException e) {
            // Выведем в консоли сообщение если вдруг ошибка
            System.out.println("Ошибка");
        }
    }

    // Метод для записи всех задач в xml файл
    default void printTasksXml() {
        // Указываем название файла и где он будет создан
        File file = new File("Tasks.xml");
        
        // Ловим ошибки при создании файла
        try{
            // Если файла не существует то он создатся или перепишется
            if (file.createNewFile()) {
                System.out.println("Файл xml со всеми задачами создан");
            }
        } catch(IOException e) {
            // Выведем в консоли сообщение если вдруг ошибка
            System.out.println("Ошибка");
        }
        
        // Ловим ошибки при создании "Ручки"
        try{
            // Создаем "Ручку"
            FileWriter writer = new FileWriter(file);

            // Продолжаем хитрить для вывода задач в xml формате 
            writer.write("<Задачи>");
            
            // Проходим по всем задачам и выводим их информаци в нужном формате, также использую обычную запись и экранирование символов
            for (Task item : Task.getTasks()) {
                writer.write("\n\t<Задача " + item.work + ">" + 
                             "\n\t\t<Приоритет>" + item.prior + "</Приоритет>" + 
                             "\n\t\t<Описание>" + item.description + "</Описание>" + 
                             "\n\t\t<Дата получения>" + item.dayTask + "</Дата получения>" + 
                             "\n\t\t<Срок сдачи>" + item.deadLine + "</Срок сдачи>" + 
                             "\n\t\t<Подпись>" + item.sign + "</Подпись>" + 
                             "\n\t</Задача>");
            }

            // Дописываем концовку
            writer.write("\n</Задачи>");
            
            // закроем "Ручку"
            writer.close();

        } catch(IOException e) {
            // Выведем в консоли сообщение если вдруг ошибка
            System.out.println("Ошибка");
        }
    }

    // Метод для записи всех задач в json файл
    default void printTasksJson() {
        // Указываем название файла и где он будет создан
        File file = new File("Tasks.json");
        
        // Ловим ошибки при создании файла
        try{
            // Если файла не существует то он создатся или перепишется
            if (file.createNewFile()) {
                System.out.println("Файл json со всеми задачами создан");
            }
        } catch(IOException e) {
            // Выведем в консоли сообщение если вдруг ошибка
            System.out.println("Ошибка");
        }
        
        // Ловим ошибки при создании "Ручки"
        try{
            // Создаем "Ручку"
            FileWriter writer = new FileWriter (file);

            // Вводим начало
            writer.write("{\n\t" + 
                            "\"Задачи\": [\n\t\t");
            
            // Проходим по всем задачам и выводим их информаци в нужном формате, также использую обычную запись и экранирование символов
            for (Task item : Task.getTasks()) {
                writer.write("\n\t\t{\n\t\t\t" + 
                             "\"Задача\": \"" + item.work + "\",\n\t\t\t" + 
                             "\"Приоритет уровня\": " + item.prior + ",\n\t\t\t" + 
                             "\"Описание\": \"" + item.description + "\",\n\t\t\t" + 
                             "\"Дата получения\": \"" + item.dayTask + "\",\n\t\t\t" + 
                             "\"Срок сдачи\": \"" + item.deadLine + "\",\n\t\t\t" + 
                             "\"Подпись\": \"" + item.sign + "\"\n\t\t},");
            }

            // Вводим конец
            writer.write("\n\t]\n}");
            
            // закроем "Ручку"
            writer.close();

        } catch(IOException e) {
            // Выведем в консоли сообщение если вдруг ошибка
            System.out.println("Ошибка");
        }
    }
}
