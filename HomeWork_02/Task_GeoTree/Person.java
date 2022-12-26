package HomeWork_02.Task_GeoTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

// Имплементируем интерфейс Print и Comparable
public class Person implements Print, Comparable<Person>{
    private Random random = new Random();
    private String fullName;

    private int age = random.nextInt(100);
    private String sex = "Боевой вертолет";

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person(String fullName, String sex) {
        this.fullName = fullName;
        this.sex = sex;
    }

    public Person(String fullName, int age, String sex) {
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s: Пол: %s; Возраст: %s;", fullName, sex, age);
    }

    // Переоопределяем метод интерфейса для Person
    @Override
    public void print() {
        // Указываем название файла и где он будет создан
        File file = new File("Person.txt");
        
        // Ловим ошибки при создании файла
        try{

            // Если файла не существует то он создатся или перепишется
            if (file.createNewFile()){
                System.out.println("Файл Person создан");
            }
            else{
                System.out.println("Файл Person уже существует");
            }
        } catch(IOException e) {
            // Выведем в консоли сообщение если вдруг ошибка
            System.out.println("Ошибка");
        }
        
        // Ловим ошибки при создании "Ручки"
        try{
            // Создаем "Ручку"
            FileWriter writer = new FileWriter (file);

            // Выведем информацию о человеке
            writer.write(this.toString());
            
            // закроем "Ручку"
            writer.close();

        } catch(IOException e) {
            // Выведем в консоли сообщение если вдруг ошибка
            System.out.println("Ошибка");
        }
    }

    // Метод сравнения персон
    // Сравнивать будем по (возраст * пол)
    @Override
    public int compareTo(Person o) {
        return (this.age * this.sex.length()) - (o.getAge() * this.sex.length());
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
