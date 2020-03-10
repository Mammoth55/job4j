package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    private int player;
    private int number;

    public Matches(int player, int number) {
        this.player = player;
        this.number = number;
    }

    public int validInput() {
        int select;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Ходит " + this.player + " игрок. Сколько спичек убрать (1-3) ? ");
            select = Integer.valueOf(input.nextLine());
        } while (select < 1 || select > 3);
        return select;
    }

    public static void main(String[] args) {
        Matches matches = new Matches(1, 11);
        System.out.println("Игра 11");
        int select;
        while (matches.number > 0) {
            System.out.println("На столе " + matches.number + " спичек.");
            select = matches.validInput();
            matches.number -= select;
            matches.player = (matches.player % 2) + 1;
        }
        System.out.println("Конец игры. Выиграл " + (matches.player % 2 + 1) + " игрок, поздравляю !");
    }
}
