package HomeWork_01.Task_01;

public class Main {
    //------------------------------------------1 задача-----------------------------------------------
    /*
    Реализовать, с учетом ооп подхода, приложение Для проведения исследований с генеалогическим древом.
    Идея: описать некоторое количество компонент, например: 
    модель человека компонента хранения связей и отношений между людьми: 
    родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д. 
    компонент для проведения исследований дополнительные компоненты,
    например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, 
    получение\построение отдельных моделей человека Под “проведением исследования”
    можно понимать получение всех детей выбранного человека.
    */
    
    public static void main(String[] args) {

        // Добавляем немного персон
        Person irina = new Person("Ирина", "Женщина");
        Person vasya = new Person("Вася", "Мужчина");
        Person masha = new Person("Маша", "Женщина");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня", "Мужчина");
        Person andrei = new Person("Андрей", "Мужчина");
        Person katia = new Person("Катя", "Женщина");
        Person misha = new Person("Миша", "Мужчина");
        Person dasha = new Person("Даша");
        GeoTree gt = new GeoTree();

        // Добавляем новые связи
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);
        gt.append(andrei, dasha);
        gt.append(katia, misha);
        gt.spouses(andrei, irina);
        gt.spouses(vasya, katia);

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent) + "\n");

        // Выводим новые на экран новые методы
        System.out.println(new Reserch(gt).spend(irina,
                Relationship.spouses) + "\n");

        System.out.println(new Reserch(gt).findAgeOrOlder(50) + "\n");

        System.out.println(new Reserch(gt).findSex("Боевой вертолет") + "\n");

        System.out.println(new Reserch(gt).findSex("Женщина") + "\n");

        System.out.println(andrei + "\n");
    }
}
