package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

        @Test
        public void whenFirstMax() {
            int result = SqMax.max(7, 0, 6, 2);
            assertThat(result, is(7));
        }
        @Test
        public void whenSecondMax() {
            int result = SqMax.max(1, 4, -2, 3);
            assertThat(result, is(4));
        }
        @Test
        public void whenThirdMax() {
            int result = SqMax.max(4, 6, 7, 5);
            assertThat(result, is(7));
        }
        @Test
        public void whenForthMax() {
            int result = SqMax.max(-1, -4, 7, 9);
            assertThat(result, is(9));
        }
        @Test
        public void whenAllEqual() {
            int result = SqMax.max(0, 0, 0, 0);
            assertThat(result, is(0));
        }
}
