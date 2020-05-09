package ru.job4j.collection;

import org.junit.Test;
import java.util.Iterator;
import java.util.Set;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void whenAsc() {
        Set<User> users = Set.of(
            new User("Petr", 32),
            new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenNameEquals() {
        Set<User> users = Set.of(
                new User("Ivan", 31),
                new User("Petr", 20),
                new User("Petr", 32));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 20)));
    }

    @Test
    public void whenComparePetrVsIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }
}