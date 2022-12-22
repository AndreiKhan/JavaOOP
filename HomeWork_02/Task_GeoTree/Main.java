package HomeWork_02.Task_GeoTree;

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
    }
}
