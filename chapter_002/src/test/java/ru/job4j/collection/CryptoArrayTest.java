package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.tracker.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CryptoArrayTest {

    @Test
    public void whenNotMin() {
        String str = CryptoArray.crypto("12", "6 6 2 2 2 2 1 2 3 3 3 3");
        assertThat(str, is("2 6 4 2 1 1 1 2 4 3 "));
    }

    @Test
    public void whenMin() {
        String str = CryptoArray.crypto("1", "1");
        assertThat(str, is("1 1 "));
    }
}
