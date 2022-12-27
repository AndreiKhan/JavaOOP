package HomeWork_04;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Task implements Comparable<Task>, Print{

    // Даем некоторым переменным стандартное значение
    int prior = 0;
    String description = "Нет";
    String work;
    String deadLine = "Нет";
    String sign;
    
    // Это для хранения дата создания задачи в нужном формате
    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
    Date date = new Date();
    String dayTask = format.format(date);

    // Список хранящий в себе все создаваемые задачи
    private static ArrayList<Task> tasks = new ArrayList<>();

    // конструкторы
    public Task(int prior, String work, String description, String deadLine, String sign) {
        this.prior = prior;
        this.work = work;
        this.description = description;
        this.deadLine = deadLine;
        this.sign = sign;

        // Добавляем созданную задачу в список и отсортировываем его
        tasks.add(this);
        Collections.sort(tasks, new TaskPriorComparator());
    }

    public Task(int prior, String work, String deadLine, String sign) {
        this.prior = prior;
        this.work = work;
        this.deadLine = deadLine;
        this.sign = sign;

        // Добавляем созданную задачу в список и отсортировываем его
        tasks.add(this);
        Collections.sort(tasks, new TaskPriorComparator());
    }

    public Task(String work, String deadLine, String sign) {
        this.prior = 1;
        this.work = work;
        this.deadLine = deadLine;
        this.sign = sign;

        // Добавляем созданную задачу в список и отсортировываем его
        tasks.add(this);
        Collections.sort(tasks, new TaskPriorComparator());
    }

    public Task(String work, String sign) {
        this.work = work;
        this.sign = sign;

        // Добавляем созданную задачу в список и отсортировываем его
        tasks.add(this);
        Collections.sort(tasks, new TaskPriorComparator());
    }

    // Сравниваем задачи по приоритету
    @Override
    public int compareTo(Task o) {

        // Сравнение задач по приоритету
        return this.prior - o.getPrior();
    }

    // Для вывода задачи в консоль
    @Override
    public String toString() {
        return "\n\nЗадача: " + work + 
               "\nПриоритет уровня: " + prior + 
               "\nОписание: " + description + 
               "\nДата получения: " + dayTask + 
               "\nСрок сдачи: " + deadLine +
               "\nПодпись: " + sign;
    }
    
    // Гетеры сетеры
    // Приоритет, задачу, дату написания задачи и имя того кто дал задачу изменять будет нельзя, поэтому их сеттеры убираем
    public int getPrior() {
        return prior;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWork() {
        return work;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public Date getDate() {
        return date;
    }

    public String getSign() {
        return sign;
    }

    public static ArrayList<Task> getTasks() {
        return tasks;
    }

    public static void setTasks(ArrayList<Task> tasks) {
        Task.tasks = tasks;
    }
}
