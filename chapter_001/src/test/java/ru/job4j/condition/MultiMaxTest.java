package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(7, 0, 6);
        assertThat(result, is(7));
    }
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenThirddMax() {
        MultiMax check = new MultiMax();
        int result = check.max(2, 8, 42);
        assertThat(result, is(42));
    }
    @Test
    public void whenAllEqual() {
        MultiMax check = new MultiMax();
        int result = check.max(0, 0, 0);
        assertThat(result, is(0));
    }
}
