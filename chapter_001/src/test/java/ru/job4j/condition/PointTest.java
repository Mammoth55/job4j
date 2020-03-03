package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance1() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        double dist = a.distance(b);
        double expected = 1.41;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void distance2() {
        Point a = new Point(1, 1);
        Point b = new Point(4, 5);
        double dist = a.distance(b);
        double expected = 5.0;
        Assert.assertEquals(expected, dist, 0.01);
    }

}
