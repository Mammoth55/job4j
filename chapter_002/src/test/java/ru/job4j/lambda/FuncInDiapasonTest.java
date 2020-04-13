package ru.job4j.lambda;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FuncInDiapasonTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        final FuncInDiapason function = new FuncInDiapason();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunctionThenSquareResults() {
        final FuncInDiapason function = new FuncInDiapason();
        List<Double> result = function.diapason(2, 6, x -> x * x + 4);
        List<Double> expected = Arrays.asList(8D, 13D, 20D, 29D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExpFunctionThenExpResults() {
        final FuncInDiapason function = new FuncInDiapason();
        List<Double> result = function.diapason(3, 5, x -> Math.pow(2, x) + 2);
        List<Double> expected = Arrays.asList(10D, 18D);
        assertThat(result, is(expected));
    }
}
