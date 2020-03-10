package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {

    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
            str = input.nextLine();
            if (!str.equals("")) {
                int answer = new Random().nextInt(3);
                switch (answer) {
                    case 0:
                        System.out.println("ДА");
                        break;
                    case 1:
                        System.out.println("НЕТ");
                        break;
                    default:
                        System.out.println("Может быть...");
                        break;
                }
            }
        } while (!str.equals(""));
    }
}

