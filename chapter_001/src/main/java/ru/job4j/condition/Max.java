package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean more = left > right;
        int result = more ? left : right;
        return result;
    }
}
