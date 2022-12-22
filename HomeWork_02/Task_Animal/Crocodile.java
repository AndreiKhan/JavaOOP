package HomeWork_02.Task_Animal;

public class Crocodile extends Animal implements CanRun, CanSwim{

    // Конструктор для крокодила для добавления ему Имени(вида), цвета, количества лап
    public Crocodile(String name, String color, int paws) {
        this.name = name;
        this.color = color;
        this.paws = paws;
    }


    // Новый тустринг
    @Override
    public String toString() {
        return "Крокодила зовут " + name + " у него " + color + " цвет, и у него " + paws + " лапы";
    }

    // Переопределяем методы интерфейсов (eat, breath, sleep, swim, run)
    @Override
    public void eat() {
        System.out.println("Крокодил кусает еду");
    }

    @Override
    public void breath() {
        System.out.println("Крокодил дышит возвдуом");
    }

    @Override
    public void sleep() {
        System.out.println("Крокодил тоже спит");
    }

    @Override
    public void swim() {
        System.out.println("Крокодил хорошо плавает");
    }

    @Override
    public void run() {
        System.out.println("Крокодил умеет быстро бегать");
    }

    // гетеры и сеттеры не добавляем так как они есть в родительском классе и мы не добавили в крокодиле новых параметров
}
