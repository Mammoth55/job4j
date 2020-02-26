package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {

    @Test
    public void whenDataAllEqualTrue() {
        boolean[] input = new boolean[] {true, true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataAllEqualFalse() {
        boolean[] input = new boolean[] {false, false, false};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotAllEqual() {
        boolean[] input = new boolean[] {true, true, true, false, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }
}