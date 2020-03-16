package ru.job4j.ex;

import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenFactorialException() {
        Fact fact = new Fact();
        int rsl = fact.calc(-2);
    }
}
