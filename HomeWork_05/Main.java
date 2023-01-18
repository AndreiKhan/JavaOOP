package HomeWork_05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Экземпляр для начала работы калькулятора
        Controller controller = new Controller();

        // Обращаемся к меню для начала
        controller.menu();
    }
}
