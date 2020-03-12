package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit Item ====");
        String name = input.askStr("Enter ID: ");
        String name1 = input.askStr("Enter name: ");
        Item item = new Item(name1);
        item.setId(name);
        boolean flag = tracker.replace(name, item);
        String str = flag ? "Операция успешна." : "Операция невозможна, нет такого ID.";
        System.out.println(str);
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ====");
        String name = input.askStr("Enter ID: ");
        boolean flag = tracker.delete(name);
        String str = flag ? "Операция успешна." : "Операция невозможна, нет такого ID.";
        System.out.println(str);
    }

    public static void showAllItem(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        Item[] items = tracker.findAll();
        for (Item i : items) {
            System.out.println(i.getName() + ", ID = " + i.getId());
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find Item by ID ====");
        String name = input.askStr("Enter ID: ");
        Item item = tracker.findById(name);
        String str = item == null ? "Операция невозможна, нет такого ID." : item.getName() + ", ID = " + item.getId();
        System.out.println(str);
    }

    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find Item by Name ====");
        String name = input.askStr("Enter Name: ");
        Item[] items = tracker.findByName(name);
        for (Item i : items) {
            System.out.println(i.getName() + ", ID = " + i.getId());
        }
    }

    public void init(Input input, Tracker tracker) {
        int select;
        boolean run = true;
        while (run) {
            this.showMenu();
            select = Integer.valueOf(input.askStr("Select number : "));
            switch (select) {
                case 0:
                    StartUI.createItem(input, tracker);
                    break;
                case 1:
                    StartUI.showAllItem(input, tracker);
                    break;
                case 2:
                    StartUI.replaceItem(input, tracker);
                    break;
                case 3:
                    StartUI.deleteItem(input, tracker);
                    break;
                case 4:
                    StartUI.findItemById(input, tracker);
                    break;
                case 5:
                    StartUI.findItemByName(input, tracker);
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}