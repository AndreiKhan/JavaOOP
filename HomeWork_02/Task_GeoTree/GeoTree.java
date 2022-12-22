package HomeWork_02.Task_GeoTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// Имплементируем интерфейс Print
public class GeoTree implements Print {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        if(parent.getAge() < children.getAge() + 30) {
            parent.setAge(parent.getAge() + 30);
        }
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void spouses(Person parent1, Person parent2) {
        tree.add(new Node(parent1, Relationship.spouses, parent2));
        tree.add(new Node(parent2, Relationship.spouses, parent1));
    }

    // Переоопределяем метод интерфейса для GeoTree
    @Override
    public void print() {
        // Указываем название файла и где он будет создан
        File file = new File("GeoTree.txt");
        
        // Ловим ошибки при создании файла
        try{

            // Если файла не существует то он создатся или перепишется
            if (file.createNewFile()){
                System.out.println("Файл GeoTree создан");
            }
            else{
                System.out.println("Файл GeoTree уже существует");
            }
        } catch(IOException e) {
            // Выведем в консоли сообщение если вдруг ошибка
            System.out.println("Ошибка");
        }
        
        // Ловим ошибки при создании "Ручки"
        try{
            // Создаем "Ручку"
            FileWriter writer = new FileWriter (file);
            
            // Проходим по всему списку связей и выведем
            for (Node node : tree) {  
                writer.write(node.toString() + "\n\n");
            }
            
            // закроем "Ручку"
            writer.close();

        } catch(IOException e) {
            // Выведем в консоли сообщение если вдруг ошибка
            System.out.println("Ошибка");
        }
        
    }
}
