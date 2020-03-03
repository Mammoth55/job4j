package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        Point c = new Point(4, 0);
        Triangle abc = new Triangle(a, b, c);
        double result = abc.area();
        double expected = 6;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenNotExist() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 9);
        Point c = new Point(0, 4);
        Triangle abc = new Triangle(a, b, c);
        double result = abc.area();
        double expected = -1;
        Assert.assertEquals(expected, result, 0.01);
    }
}
