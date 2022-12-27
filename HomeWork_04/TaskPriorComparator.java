package HomeWork_04;

import java.util.Comparator;

public class TaskPriorComparator implements Comparator<Task> {

    // Сортировка задач в листе будем по приоритету
    @Override
    public int compare(Task o1, Task o2) {
        
        return o2.getPrior() - o1.getPrior();
    }
    
}
