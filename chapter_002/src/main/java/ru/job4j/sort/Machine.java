package ru.job4j.sort;

import java.util.Arrays;

public class Machine {

    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int surrender = money - price;
        for (int coin : coins) {
            while (surrender >= coin) {
                surrender -= coin;
                rsl[size++] = coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}