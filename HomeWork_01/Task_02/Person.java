package HomeWork_01.Task_02;

//import java.util.Random;

public class Person {
    // Для случайного добавления размера обуви и одежды
    //private Random random = new Random();
    
    // Параметры
    private String name;
    private String sizeCloth;
    private int sizeShoes;

    // Конструктор
    public Person(String name, String sizeCloth, int sizeShoes) {
        this.name = name;
        this.sizeCloth = sizeCloth;
        this.sizeShoes = sizeShoes;
    }

    // Новый тустринг
    @Override
    public String toString() {
        return "У " + name + " -> Размер обуви: " + sizeShoes + " Размер одежды: " + sizeCloth;
    }

    // Гетеры сетеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSizeCloth() {
        return sizeCloth;
    }

    public void setSizeCloth(String sizeCloth) {
        this.sizeCloth = sizeCloth;
    }

    public int getSizeShoes() {
        return sizeShoes;
    }

    public void setSizeShoes(int sizeShoes) {
        this.sizeShoes = sizeShoes;
    }
}
