package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        System.out.println("Игра 11");
        String winner = "второй";
        int matches = 11;
        int select;
        Scanner input = new Scanner(System.in);
        do {
            do {
                System.out.println("На столе " + matches + " спичек.");
                System.out.print("Ходит первый игрок. Сколько спичек убрать (1-3) ? ");
                select = Integer.valueOf(input.nextLine());
            } while (select < 1 || select > 3);
            matches -= select;
            if (matches < 1) {
                winner = "первый";
                break;
            }
            do {
                System.out.println("На столе " + matches + " спичек.");
                System.out.print("Ходит второй игрок. Сколько спичек убрать (1-3) ? ");
                select = Integer.valueOf(input.nextLine());
            } while (select < 1 || select > 3);
            matches -= select;
        } while (matches > 0);
        System.out.println("Конец игры. Выиграл " + winner + " игрок, поздравляю !");
    }
}
