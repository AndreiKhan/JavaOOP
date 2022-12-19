package HomeWork_01.Task_03;

import java.util.Random;

public class Cat {
    private Random random = new Random();

    // Параметры
    private String name;
    private int hunger = random.nextInt(100);
    private int selfishness = random.nextInt(100);

    // Конструкторы
    public Cat(String name) {
        this.name = name;
    }

    // Новый тустринг
    @Override
    public String toString() {
        return "Кота зовут " + name + " и он голоден на " + hunger + "% и эгоистичен он на " + selfishness + "%";
    }

    // Гетеры сетеры
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
