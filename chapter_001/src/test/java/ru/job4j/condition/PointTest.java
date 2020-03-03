package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance1() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(3, 3, 3);
        double dist = a.distance3d(b);
        double expected = 5.15;
        Assert.assertEquals(expected, dist, 0.05);
    }

    @Test
    public void distance2() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 11);
        double dist = a.distance3d(b);
        double expected = 11.0;
        Assert.assertEquals(expected, dist, 0.01);
    }
}
