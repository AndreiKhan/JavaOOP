package HomeWork_01.Task_01;

import java.util.Random;

public class Person {
    private Random random = new Random();
    private String fullName;

    // Добавляем новые параметры и задаем им изначальные значения
    private int age = random.nextInt(100);
    private String sex = "Боевой вертолет";

    public Person(String fullName) {
        this.fullName = fullName;
    }

    //добавляем новых конструкторов
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

    // Немного изменил вывод персоны
    @Override
    public String toString() {
        return String.format("Имя: %s: Пол: %s; Возраст: %s;", fullName, sex, age);
    }

    //гетеры сетеры
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
