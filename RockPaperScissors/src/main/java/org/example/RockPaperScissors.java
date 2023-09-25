package org.example;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Добро пожаловать в игру 'Камень, ножницы, бумага'!");
        System.out.println("Выберите один из вариантов: камень, ножницы, бумага.");
        System.out.print("Ваш выбор: ");
        String userChoice = scanner.next().toLowerCase();

        if (userChoice.equals("камень") || userChoice.equals("ножницы") || userChoice.equals("бумага")) {
            int computerChoice = random.nextInt(3); // 0 - камень, 1 - ножницы, 2 - бумага

            switch (computerChoice) {
                case 0:
                    System.out.println("Компьютер выбрал: Камень");
                    break;
                case 1:
                    System.out.println("Компьютер выбрал: Ножницы");
                    break;
                case 2:
                    System.out.println("Компьютер выбрал: Бумагу");
                    break;
            }

            if ((userChoice.equals("камень") && computerChoice == 1) ||
                    (userChoice.equals("ножницы") && computerChoice == 2) ||
                    (userChoice.equals("бумага") && computerChoice == 0)) {
                System.out.println("Вы выиграли!");
            } else if ((userChoice.equals("камень") && computerChoice == 2) ||
                    (userChoice.equals("ножницы") && computerChoice == 0) ||
                    (userChoice.equals("бумага") && computerChoice == 1)) {
                System.out.println("Компьютер выиграл!");
            } else {
                System.out.println("Ничья!");
            }
        } else {
            System.out.println("Некорректный выбор. Попробуйте еще раз.");
        }

        scanner.close();
    }
}
