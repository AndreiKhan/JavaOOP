package HomeWork_02.Task_Animal;

import java.util.Comparator;

public class AnimalPawsComparator implements Comparator<Animal> {


    // Сравниваем по количеству лап
    @Override
    public int compare(Animal o1, Animal o2) {
        
        return o1.getPaws() - o2.getPaws();
    }
    
}
