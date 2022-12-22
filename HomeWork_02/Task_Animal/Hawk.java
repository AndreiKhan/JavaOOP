package HomeWork_02.Task_Animal;

public class Hawk extends Animal implements CanFly{

    // Конструктор для ястреба для добавления ему Имени(вида), цвета, количества лап
    public Hawk(String name, String color, int paws) {
        this.name = name;
        this.color = color;
        this.paws = paws;
    }


    // Новый тустринг
    @Override
    public String toString() {
        return "Ястреба зовут " + name + " у него " + color + " цвет, и у него " + paws + " лапы";
    }

    // Переопределяем методы интерфейсов (eat, breath, sleep, fly)
    @Override
    public void eat() {
        System.out.println("Ястреб клюет еду");
    }

    @Override
    public void breath() {
        System.out.println("Ястреб дышит воздухом");
    }

    @Override
    public void sleep() {
        System.out.println("Ястреб также спит");
    }

    @Override
    public void fly() {
        System.out.println("Ястреб умеет высоко летать");
    }

    // гетеры и сеттеры не добавляем так как они есть в родительском классе и мы не добавили в крокодиле новых параметров
}
