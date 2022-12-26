package HomeWork_02.Task_Animal;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    //------------------------------2 задача--------------------------------
    /*
    Обеспечить переход от использования явных классов в сторону использования абстрактных типов. Т е работаем не с:
    конкретным экземпляром котика, а с интерфейсом “котик”, лучше уйти от взаимодействия с конкретными питомцами и
    повысить уровень абстракции до взаимодействия с котиком, собачкой или хомяком т е с интерфейсом “животное”
    */

    public static void main(String[] args) {
        // Коты
        Cat cat_1 = new Cat("Маришка", "Серый", 4);

        // Крокодил
        Crocodile croco = new Crocodile("Крок", "Зеленый", 4);

        // Ястреб
        Hawk hawk = new Hawk("Ястреб", "Коричневый", 2);

        // Человек
        // Person andrei = new Person("Андрей");

        // Список со всеми животными
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat_1);
        animals.add(croco);
        animals.add(hawk);
        System.out.println(animals + "\n");
        
        // Выводим отсортированный список по количеству лап
        Collections.sort(animals, new AnimalPawsComparator());
        System.out.println(animals + "\n");

        // Выведем старого котика
        System.out.println(cat_1);
        System.out.println();


        // Выведем крокодила
        System.out.println(croco);
        System.out.println();

        // Выведем ястреба
        System.out.println(hawk);
        System.out.println();

        // Выведем один из методов крокодила
        croco.run();
        System.out.println();

        // Выведем один из методов ястреба
        hawk.fly();
        System.out.println();

        // Выведем один из методов кота
        cat_1.eat();
        System.out.println();
    }
}
