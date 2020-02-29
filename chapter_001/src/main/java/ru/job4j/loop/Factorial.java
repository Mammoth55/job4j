package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return result;
        }
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
