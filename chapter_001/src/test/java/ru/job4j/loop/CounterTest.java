package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTwelve() {
        int rsl = Counter.sumByEven(1, 12);
        int expected = 42;
        assertThat(rsl, is(expected));
    }
}
