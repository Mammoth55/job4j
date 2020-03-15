package ru.job4j.tracker;

public class FindByNameAction implements UserAction {

    @Override
    public String name() {
        return "=== Find Item by Name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter Name: ");
        for (Item i : tracker.findByName(name)) {
            System.out.println(String.format("%s %s", i.getId(), i.getName()));
        }
        return true;
    }
}
