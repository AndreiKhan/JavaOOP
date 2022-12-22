package HomeWork_02.Task_GeoTree;

import java.util.ArrayList;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;


    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }


    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }


    public ArrayList<String> findAgeOrOlder(int age) {

        for (Node t : tree) {

            if (t.p1.getAge() >= age) {

                if(!result.contains(t.p1.getFullName() + " " + t.p1.getAge() + " лет")) {
                    
                    result.add(t.p1.getFullName() + " " + t.p1.getAge() + " лет");
                }
            }
        }
        return result;
    }

    
    public ArrayList<String> findSex(String sex) {

        for (Node t : tree) {

            if (t.p1.getSex() == sex) {

                if(!result.contains(t.p1.getFullName() + " имеет пол -> " + sex)) {
                    
                    result.add(t.p1.getFullName() + " имеет пол -> " + sex);
                }
            }
        }
        return result;
    }
}
