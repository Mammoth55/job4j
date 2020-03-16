package ru.job4j.ex;

public class Fact {

    public static void main(String[] args) {
        Fact fact = new Fact();
        System.out.println(fact.calc(5));
        System.out.println(fact.calc(1));
        System.out.println(fact.calc(0));
        System.out.println(fact.calc(-5));
    }

    public int calc(int n) {
        // истинный факториал определен на множестве НЕОТРИЦАТЕЛЬНЫХ целых чисел ! корректируем алгоритм
        if (n < 0) {
            throw new IllegalArgumentException("Illegal argument of Factorial, must be NOT Negative.");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}