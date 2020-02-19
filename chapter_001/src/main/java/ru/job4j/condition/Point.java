package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double a = Math.pow( (x2 - x1), 2);
        double b = Math.pow( (y2 - y1), 2);
        double rsl = Math.sqrt(a + b);
        return rsl;
    }

    public static void main(String[] args) {

        double result = Point.distance(0, 0, 1, 0);
        System.out.println("result (0, 0) to (1, 0) " + result);

        result = Point.distance(0, 0, 1, 1);
        System.out.println("result (0, 0) to (1, 1) " + result);

        result = Point.distance(1, 2, 4, 6);
        System.out.println("result (1, 2) to (4, 6) " + result);
    }
}
