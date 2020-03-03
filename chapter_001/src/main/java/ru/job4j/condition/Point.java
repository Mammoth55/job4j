package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private double x;
    private double y;
    private double z;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        Point a = new Point(this.x, this.y);
        Point b = new Point(that.x, that.y);
        double katet1 = a.distance(b);
        a = new Point(this.z, 0);
        b = new Point(that.z, 0);
        double katet2 = a.distance(b);
        a = new Point(katet1, 0);
        b = new Point(0, katet2);
        double rsl = a.distance(b);
        return rsl;
    }

    public static void main(String[] args) {
        Point a = new Point(1, 1, 1);
        Point b = new Point(0, 0, 0);
        double dist = a.distance3d(b);
        System.out.println(dist);
    }
}
