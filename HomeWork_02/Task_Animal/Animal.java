package HomeWork_02.Task_Animal;

public abstract class Animal implements Comparable<Animal> {
    // Абстрактный класс с парметрами
    // name - Имя или вид животного
    String name;

    // Цвет
    String color;
    
    // Количество лап
    int paws;

    // Сравнение всех животных будет по длине цвета
    @Override
    public int compareTo(Animal o) {
        return this.getColor().length() - o.getColor().length();
    }

    // Гетеры и сетеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }
}
