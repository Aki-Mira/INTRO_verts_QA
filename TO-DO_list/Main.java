import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Удалить задачу");
            System.out.println("3. Просмотреть задачи");
            System.out.println("4. Выход");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите новую задачу:");
                    scanner.nextLine(); // Очистка буфера
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println("Задача добавлена.");
                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("Список задач пуст.");
                    } else {
                        System.out.println("Выберите задачу для удаления (введите номер):");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        int taskIndex = scanner.nextInt();
                        if (taskIndex >= 1 && taskIndex <= tasks.size()) {
                            tasks.remove(taskIndex - 1);
                            System.out.println("Задача удалена.");
                        } else {
                            System.out.println("Неверный номер задачи.");
                        }
                    }
                    break;
                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("Список задач пуст.");
                    } else {
                        System.out.println("Список задач:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Выход из приложения.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
