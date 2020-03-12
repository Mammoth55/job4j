package ru.job4j.tracker;

public class DeleteAction implements UserAction {

    @Override
    public String name() {
        return "=== Delete Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter ID: ");
        String str = tracker.delete(name) ? "Операция успешна." : "Операция невозможна, нет такого ID.";
        System.out.println(str);
        return true;
    }
}
