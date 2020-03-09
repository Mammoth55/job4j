package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenGeneratedIdIsNotEqual() {
        Tracker tracker = new Tracker();
        assertThat(tracker.generateId(), not(tracker.generateId()));
    }

    @Test
    public void whenAddNewItemsThenFindAll() {
        Tracker tracker = new Tracker();
        Item[] item = new Item[4];
        item[0] = new Item("test1");
        tracker.add(item[0]);
        item[1] = new Item("test2");
        tracker.add(item[1]);
        item[2] = new Item("test3");
        tracker.add(item[2]);
        item[3] = new Item("test4");
        tracker.add(item[3]);
        Item[] result = tracker.findAll();
        assertThat(result, is(item));
    }

    @Test
    public void whenAddNewItemsThenFindById() {
        Tracker tracker = new Tracker();
        Item[] item = new Item[4];
        item[0] = new Item("test1");
        tracker.add(item[0]);
        item[1] = new Item("test2");
        tracker.add(item[1]);
        item[2] = new Item("test3");
        tracker.add(item[2]);
        item[3] = new Item("test4");
        tracker.add(item[3]);
        Item result = tracker.findById(item[1].getId());
        assertThat(result, is(item[1]));
    }

    @Test
    public void whenAddNewItemsThenFindByName() {
        Tracker tracker = new Tracker();
        Item[] item = new Item[4];
        item[0] = new Item("test1");
        tracker.add(item[0]);
        item[1] = new Item("test2");
        tracker.add(item[1]);
        item[2] = new Item("test3");
        tracker.add(item[2]);
        item[3] = new Item("test4");
        tracker.add(item[3]);
        Item[] result = tracker.findByName(item[2].getName());
        assertThat(result[0].getName(), is(item[2].getName()));
    }
}