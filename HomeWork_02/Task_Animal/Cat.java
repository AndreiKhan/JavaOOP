package HomeWork_02.Task_Animal;

import java.util.Random;

public class Cat extends Animal implements CanRun, CanSwim{
    private Random random = new Random();

    // Убрал параметр name так как он есть в Animal
    private int hunger = random.nextInt(100);
    private int selfishness = random.nextInt(100);

    // Конструктор, добавили цвет и количество лап
    public Cat(String name, String color, int paws) {
        this.name = name;
        this.color = color;
        this.paws = paws;
    }

    public String starve() {

        if (hunger > 50) {
            return name + " начинает кричать";
        }

        return name + " не кричит потому что спит";
    }


    // Немного переделаем тустринг под задачу
    @Override
    public String toString() {
        return "Кота зовут " + name + " у него " + color + " цвет, и у него " + paws + " лапы";
    }

    // Переопределяем методы интерфейсов (eat, breath, sleep, swim, run)
    @Override
    public void eat() {
        System.out.println("Кот любит кушать");
    }

    @Override
    public void breath() {
        System.out.println("Кот дышит");
    }

    @Override
    public void sleep() {
        System.out.println("Кот спит");
    }

    @Override
    public void swim() {
        System.out.println("Кот умеет плавать");
    }

    @Override
    public void run() {
        System.out.println("Кот быстро бегает");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getSelfishness() {
        return selfishness;
    }

    public void setSelfishness(int selfishness) {
        this.selfishness = selfishness;
    }
}
