package views;

import java.util.Scanner;

public class AdminView {

    public String showGetMenu(){
        System.out.println("Введите название фильма:");
        Scanner sc = new Scanner(System.in);
        var res = sc.nextLine();
        return res;
    }

    public String showAddMenu(){
        System.out.println("Введите название фильма для добавления:");
        Scanner sc = new Scanner(System.in);
        var res = sc.nextLine();
        return res;
    }

    public String showEditMenu(){
        System.out.println("Введите название фильма для редактирования:");
        Scanner sc = new Scanner(System.in);
        var res = sc.nextLine();
        return res;
    }

    public String showDeleteMenu(){
        System.out.println("Введите название фильма для удаления:");
        Scanner sc = new Scanner(System.in);
        var res = sc.nextLine();
        return res;
    }
}
