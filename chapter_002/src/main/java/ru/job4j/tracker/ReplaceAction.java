package ru.job4j.tracker;

public class ReplaceAction implements UserAction {

    @Override
    public String name() {
        return "=== Edit Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter ID: ");
        String name1 = input.askStr("Enter name: ");
        Item item = new Item(name1);
        item.setId(name);
        String str = tracker.replace(name, item) ? "Операция успешна." : "Операция невозможна, нет такого ID.";
        System.out.println(str);
        return true;
    }
}
