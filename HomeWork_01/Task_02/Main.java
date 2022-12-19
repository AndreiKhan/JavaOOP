package HomeWork_01.Task_02;

public class Main {
    public static void main(String[] args) {
        // Экземпляр взаимодействия
        Interactions interactions = new Interactions();

        // Шкафы
        Cabinet cabinet_1 = new Cabinet("Одежда",  "M");
        Cabinet cabinet_2 = new Cabinet("Одежда",  "XXL");
        Cabinet cabinet_3 = new Cabinet("Обувь",  45);

        // Люди которые ищую одежду или обувь
        Person andrei = new Person("Андрей", "M",  45);
        Person sasha = new Person("Саша", "XXL", 50);
        Person katia = new Person("Катя", "S",  20);

        // Выводим в консоль все что есть
        System.out.println(cabinet_1);
        System.out.println(cabinet_2);
        System.out.println(cabinet_3);
        System.out.println();

        System.out.println(andrei);
        System.out.println(sasha);
        System.out.println(katia);
        System.out.println();

        System.out.println(interactions.tryFindCloth(andrei, cabinet_1));
        System.out.println(interactions.tryFindCloth(sasha, cabinet_2));
        System.out.println(interactions.tryFindCloth(katia, cabinet_1));
        System.out.println(interactions.tryFindShoes(katia, cabinet_3));
    }
}
