package HomeWork_01.Task_01;

import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        // Если возраст рандомнулся и меньше чем у ребенка или очень маленький промежуток то увеличиваем возраст родителя
        if(parent.getAge() < children.getAge() + 30) {
            parent.setAge(parent.getAge() + 30);
        }
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    // Создаем связи супругов
    public void spouses(Person parent1, Person parent2) {
        tree.add(new Node(parent1, Relationship.spouses, parent2));
        tree.add(new Node(parent2, Relationship.spouses, parent1));
    }
}
