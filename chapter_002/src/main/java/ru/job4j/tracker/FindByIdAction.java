package ru.job4j.tracker;

public class FindByIdAction implements UserAction {

    @Override
    public String name() {
        return "=== Find Item by ID ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter ID: ");
        Item item = tracker.findById(name);
        String str = item == null ? "Операция невозможна, нет такого ID." : item.getName() + ", ID = " + item.getId();
        System.out.println(str);
        return true;
    }
}
