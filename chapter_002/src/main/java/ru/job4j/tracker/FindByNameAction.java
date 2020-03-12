package ru.job4j.tracker;

public class FindByNameAction implements UserAction {

    @Override
    public String name() {
        return "=== Find Item by Name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter Name: ");
        Item[] items = tracker.findByName(name);
        for (Item i : items) {
            System.out.println(i.getName() + ", ID = " + i.getId());
        }
        return true;
    }
}
