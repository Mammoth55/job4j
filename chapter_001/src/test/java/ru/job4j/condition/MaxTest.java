package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1() {
        int result = Max.max(11, -2, 0, 9);
        assertThat(result, is(11));
    }

    @Test
    public void whenMax2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3() {
        int result = Max.max(3, 1, 7);
        assertThat(result, is(7));
    }

    @Test
    public void when4Equal() {
        int result = Max.max(5, 5, 5, 5);
        assertThat(result, is(5));
    }
}
