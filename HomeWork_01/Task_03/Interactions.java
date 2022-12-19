package HomeWork_01.Task_03;

public class Interactions {

    // Метод для попытки позвать котика
    public String call(Person person, Cat cat) {
        
        // Проверяем насколько голоден кот
        if (cat.getSelfishness() - cat.getHunger() < 50) {
            return cat.getName() + " прибегает на зов";
        }
        return cat.getName() + " игнорирует так как ему ничего не нужно";
    }

    // Метод для того чтобы узнать будет ли котик мурлыкать если его гладить
    public String pet(Person person, Cat cat) {

        // Проверяем насколько голоден кот
        if (cat.getSelfishness() - cat.getHunger() < 20) {
            return cat.getName() + " мурлыкает";
        }
        return cat.getName() + " игнорирует ухаживания человека";
    }

    // Метод для того чтобы узнать будет ли котик орать ночью
    public String starve(Cat cat) {

        // Проверяем насколько кот голоден
        if (cat.getHunger() > 50) {
            return cat.getName() + " начинает кричать";
        }

        return cat.getName() + " не кричит потому что спит";
    }
}