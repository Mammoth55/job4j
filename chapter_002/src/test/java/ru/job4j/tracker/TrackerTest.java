package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.IsNull.nullValue;

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
        List<Item> items = new ArrayList();
        Item item = new Item("test1");
        items.add(item);
        tracker.add(item);
        item = new Item("test2");
        items.add(item);
        tracker.add(item);
        item = new Item("test3");
        items.add(item);
        tracker.add(item);
        item = new Item("test4");
        items.add(item);
        tracker.add(item);
        List<Item> result = tracker.findAll();
        assertThat(result, is(items));
    }

    @Test
    public void whenAddNewItemsThenFindById() {
        Tracker tracker = new Tracker();
        List<Item> items = new ArrayList();
        Item item = new Item("test1");
        items.add(item);
        tracker.add(item);
        item = new Item("test2");
        items.add(item);
        tracker.add(item);
        item = new Item("test3");
        items.add(item);
        tracker.add(item);
        item = new Item("test4");
        items.add(item);
        tracker.add(item);
        Item result = tracker.findById(items.get(1).getId());
        assertThat(result, is(items.get(1)));
    }

    @Test
    public void whenAddNewItemsThenFindByName() {
        Tracker tracker = new Tracker();
        List<Item> items = new ArrayList();
        Item item = new Item("test1");
        items.add(item);
        tracker.add(item);
        item = new Item("test2");
        items.add(item);
        tracker.add(item);
        item = new Item("test3");
        items.add(item);
        tracker.add(item);
        item = new Item("test4");
        items.add(item);
        tracker.add(item);
        List<Item> result = tracker.findByName(items.get(2).getName());
        assertThat(result.get(0).getName(), is(items.get(2).getName()));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}