package HomeWork_05;

public class View {

    // Метод выводит меню со всеми достпуными функциями в калькуляторе
    // если добавить новую функцию, то добавляем сдесь лишь строку, в model метод, в controller новый кейс для работы
    public void showMenu() {
        System.out.println("Введите цифру для выбора:");

        System.out.println("0 - Закончить работу");
        System.out.println("1 - Ввести выражение");
        System.out.println("2 - Ввести комплексные числа");
    }

    // Метод для вывода результата подсчета
    public void result(Double result, String express) {
        System.out.println(express + " = " + result);
    }

    // Метод для вывода результата подсчета комплексных чисел
    public void resultComplex(String result, String express) {
        System.out.println(express + " = " + result);
    }

    // Метод для вывода ссобщения пользователю
    public void messageToUser(String message) {
        System.out.println(message);
    }
}
