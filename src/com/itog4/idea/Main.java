package com.itog4.idea;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Решите загадку, у Вас 3 попытки: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”");
        System.out.println("Попытка №1. Вы имеете право на подсказку только в первой попытке (введите 'Подсказка') или свой вариант ответа");

        String answer = "Заархивированный вирус";
        String help = "Подсказка";

        String a = input.nextLine();
        if (Objects.equals(a, answer)) {
            System.out.println("Правильно");
        }
        else if (Objects.equals(a, help)) {
            System.out.println("Лук");
            System.out.println("Подсказка использована, введите свой ответ:");
            String c = input.nextLine();

                if (Objects.equals(c, answer)) {
                System.out.println("Правильно");
                }
                else {
                System.out.println("Обидно, приходи в другой раз");
                }
        }
        else {
            System.out.println("Подумай еще!");
            System.out.println("Попытка №2:");
            String b = input.nextLine();

            if (Objects.equals(b, answer)) {
                System.out.println("Правильно");
            }
            else if (Objects.equals(b, help)) {
                System.out.println("Подсказка уже недоступна");
            }
            else {
                System.out.println("Подумай еще!");
                System.out.println("Попытка №3:");
                String e = input.nextLine();

                if (Objects.equals(e, answer)) {
                    System.out.println("Правильно");
                }
                else if (Objects.equals(e, help)) {
                    System.out.println("Подсказка уже недоступна");
                }
                else {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }
    }
}