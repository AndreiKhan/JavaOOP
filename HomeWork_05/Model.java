package HomeWork_05;

import java.util.Scanner;

public class Model {

    View view = new View();

    // Метод для подсчета выражения
    public void simpleExperession(String expres) {

        String[] term = expres.split(" ");
        Double number;

        // Кейс для проверки какой знак мы использовали
        switch(term[1]) {
            case "+":
                number = Double.parseDouble(term[0]) + Double.parseDouble(term[2]);
                view.result(number, expres);
                break;

            case "-":
                number = Double.parseDouble(term[0]) - Double.parseDouble(term[2]);
                view.result(number, expres);
                break;

            case "*":
                number = Double.parseDouble(term[0]) * Double.parseDouble(term[2]);
                view.result(number, expres);
                break;

            case "/":
                number = Double.parseDouble(term[0]) / Double.parseDouble(term[2]);
                view.result(number, expres);
                break;
            default:
                number = 0.0;
                view.messageToUser("Введено неправильное выражение");
        }
    }

    // Метод для подсчета комплесных чисел
    public void complex(String expression) {
        // Вводим переменные для хранения значений действительных и мнимых чисел
        Double re;
        Double re_01;
        Double re_02;
        Double im;
        Double im_01;
        Double im_02;
        String result;

        // Разбиваем полученную строку на слагаемые
        String[] term = expression.split(" ");
        term[2] = term[2].substring(0, term[2].length() - 1);
        term[6] = term[6].substring(0, term[6].length() - 1);

        // Задаем значения
        re_01 = Double.parseDouble(term[0]);
        re_02 = Double.parseDouble(term[4]);
        im_01 = Double.parseDouble(term[2]);
        im_02 = Double.parseDouble(term[6]);
        
        // Кейс для выбора нужной формулы подсчета (- * + /)
        switch(term[3]) {
            case "+":
                re = re_01 + re_02;
                im = im_01 + im_02;

                result = re.toString() + " + " + im.toString() + "i";

                view.resultComplex(result, expression);
                break;

            case "-":
                re = re_01 - re_02;
                im = im_01 - im_02;

                result = re.toString() + " + " + im.toString() + "i";

                view.resultComplex(result, expression);
                break;

            case "*":
                re = re_01 * re_02 - im_01 * im_02;
                im = im_01 * re_02 + re_01 - im_02;

                result = re.toString() + " + " + im.toString() + "i";

                view.resultComplex(result, expression);
                break;

            case "/":
                re = (re_01 * re_02 - im_01 * im_02) / (Math.pow(re_02, 2) + Math.pow(im_02, 2));
                im = (im_01 * re_02 - re_01 * im_02) / (Math.pow(re_02, 2) + Math.pow(im_02, 2));

                result = re.toString() + " + " + im.toString() + "i";

                view.resultComplex(result, expression);
                break;

            default:
                view.messageToUser("Введено неправильное выражение");
        }
    }

    // Метод для ввода с клавиатуры
    public String input() {
        // Вводим выражение
        Scanner input = new Scanner(System.in);

        String expression = input.nextLine();

        return expression;
    }
}
