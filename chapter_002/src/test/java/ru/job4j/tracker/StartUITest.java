package ru.job4j.tracker;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenInit() {
        List<String> list = new ArrayList<>();
        list = Arrays.asList(new String[] {"0"});
        StubInput input = new StubInput(list);
        StubAction action = new StubAction();
        List<UserAction> actions = new ArrayList();
        actions.add(action);
        new StartUI().init(input, new Tracker(), actions);
        assertThat(action.isCall(), is(true));
    }

    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        List<String> list = new ArrayList<>();
        list = Arrays.asList(new String[] {"0"});
        Input input = new StubInput(list);
        List<UserAction> actions = new ArrayList();
        actions.add(new StubAction());
        new StartUI().init(input, new Tracker(), actions);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. Stub action")
                .toString();
        String real = new String(out.toByteArray());
        assertThat(real, is(expect));
        System.setOut(def);
    }
}