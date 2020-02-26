package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        // int value = 5;
        int result = find.indexOf(input, 5);
        // int expect = 0;
        assertThat(result, is(0));
    }
    @Test
    public void whenArrayHas1ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        // int value = 5;
        int result = find.indexOf(input, 1);
        // int expect = 0;
        assertThat(result, is(-1));
    }
}