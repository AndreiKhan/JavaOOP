package HomeWork_05;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Controller {

    View view = new View();
    Model model = new Model();
    
    public void menu() throws IOException {
        // Лог для записи логов в LogCalc.txt
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("logCalc.txt");
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info("Калькулятор начал работу");

        // Показываем доступные функции
        view.showMenu();

        // Проверяем какую цифру ввел пользователь для выбора функции
        switch(model.input()) {
            case "0":
                logger.info("Калькулятор завершил работу");
                break;

            case "1":
                view.messageToUser("Введите выражение: Например: 2 / 5");
                logger.info("Пользователь воспользовался функцией ввода выражения");

                model.simpleExperession(model.input());
                break;

            case "2":
                view.messageToUser("Введите комплесные числа: Например: 2 + 5i - 2 + 7i");
                logger.info("Пользователь воспользовался функцией ввода комплексных чисел");

                model.complex(model.input());
                break;

            default:
                view.messageToUser("Введена неправильная цифра");
                logger.info("Калькулятор завершил работу");
        }

        logger.info("Калькулятор завершил работу");
    }
}
