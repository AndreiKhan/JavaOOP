package HomeWork_02.Task_GeoTree;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    //------------------------------------------1 задача-----------------------------------------------
    /*
    Обеспечить переход от использования явных классов в сторону использования абстрактных типов. Т е работаем не с:
    конкретным экземпляром генеалогического древа, а с интерфейсом “ генеалогическое древо”
    */
    
    public static void main(String[] args) {

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

        // Создадим список людей и заполним его
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(irina);
        personList.add(vasya);
        personList.add(masha);
        personList.add(jane);
        personList.add(ivan);
        personList.add(andrei);
        personList.add(katia);
        personList.add(misha);
        personList.add(dasha);

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

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.spouses) + "\n");

        System.out.println(new Reserch(gt).findAgeOrOlder(50) + "\n");

        System.out.println(new Reserch(gt).findSex("Боевой вертолет") + "\n");

        System.out.println(new Reserch(gt).findSex("Женщина") + "\n");

        System.out.println(andrei + "\n");


        // Печатаем файл с полным древом людей и файл с одним человеком
        gt.print();
        andrei.print();

        // Напечатаем метод принт
        new Reserch(gt).print();

        // Сравним людей по возрасту
        if (andrei.compareTo(irina) > 0) {
            System.out.println(andrei.getFullName() + " старше " + irina.getFullName());

        } else if (andrei.compareTo(irina) == 0) {
            System.out.println(andrei.getFullName() + " одного возраста " + irina.getFullName());

        } else {
            System.out.println(andrei.getFullName() + " младше " + irina.getFullName());
        }

        // Выведем список людей
        System.out.println();
        System.out.println(personList);

        // Отсортируем список по длине пола (Боевые вертолеты в конце)
        System.out.println();
        Collections.sort(personList, new PersonSexComparator());
        System.out.println(personList);
    }
}
