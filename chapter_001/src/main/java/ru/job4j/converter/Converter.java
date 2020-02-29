package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70; // формула перевода рублей в евро.
        return rsl;
    }
    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллары.
        return rsl;
    }
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(420);
        System.out.println("420 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(420);
        System.out.println("420 rubles are " + dollar + " dollars.");

        int in = 420;
        int expected = 6;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("420 rubles are 6 euro. Test result : " + passed);

        in = 420;
        expected = 7;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("420 rubles are 7 dollars. Test result : " + passed);
    }
}
