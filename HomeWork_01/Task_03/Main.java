package HomeWork_01.Task_03;

public class Main {
    //------------------------------3 задача--------------------------------
    /*
    Подумать как описать логику взаимодействия человека и домашнего питомца. 
    Сценарий: “Человек “зовёт” котика “кис-кис”, котик отзывается. 
    Какое ещё взаимодействие может быть?
    */

    public static void main(String[] args) {
        // Экземпляр взаимодействия
        Interactions interactions = new Interactions();

        // Коты
        Cat cat_1 = new Cat("Маришка");
        Cat cat_2 = new Cat("Кузя");
        Cat cat_3 = new Cat("Маркс");

        // Люди которые ищую одежду или обувь
        Person andrei = new Person("Андрей");

        // Выводим в консоль все что есть
        System.out.println(cat_1);
        System.out.println(cat_2);
        System.out.println(cat_3);
        System.out.println();

        System.out.println(andrei);
        System.out.println();

        System.out.println(interactions.call(andrei, cat_1));
        System.out.println(interactions.call(andrei, cat_2));
        System.out.println(interactions.call(andrei, cat_3));
        System.out.println();

        System.out.println(interactions.pet(andrei, cat_1));
        System.out.println(interactions.pet(andrei, cat_2));
        System.out.println(interactions.pet(andrei, cat_3));
        System.out.println();

        System.out.println(interactions.starve(cat_1));
        System.out.println(interactions.starve(cat_2));
        System.out.println(interactions.starve(cat_3));
        System.out.println();
    }
}
