package HomeWork_02.Task_GeoTree;

import java.util.Comparator;

public class PersonSexComparator implements Comparator<Person>{

    // Сравниваем по длине название пола
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getSex().length() - o2.getSex().length();
    }
    
}
