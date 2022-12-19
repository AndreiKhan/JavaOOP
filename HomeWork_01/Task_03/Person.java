package HomeWork_01.Task_03;


public class Person {
    // Параметры
    private String name;

    // Конструктор
    public Person(String name) {
        this.name = name;
    }

    // Новый тустринг
    @Override
    public String toString() {
        return name + " не влияет на кота, потому что коты, делают то что они хотят";
    }

    // Гетеры сетеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
