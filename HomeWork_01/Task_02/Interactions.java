package HomeWork_01.Task_02;

public class Interactions {

    // Метод для поиска подходящей одежды в шкафу
    public String tryFindCloth(Person person, Cabinet cabinet) {

        // Проверка есть ли в шкафу нужное
        if (cabinet.getSizeCloth() == person.getSizeCloth()) {
            return person.getName() + " находит одежду подходящего размера";
        }

        return person.getName() + " уходит с грустью так как не было подходящей одежды";
    }

    // Метод для поиска подходящей обуви в шкафу
    public String tryFindShoes(Person person, Cabinet cabinet) {

        // Проверка есть ли в шкафу нужное
        if (cabinet.getSizeShoes() == person.getSizeShoes()) {
            return person.getName() + " находит обувь подходящего размера";
        }

        return person.getName() + " уходит с грустью так как не было подходящей обуви";
    }
}
