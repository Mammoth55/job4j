package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        int select;
        boolean flag;
        boolean run = true;
        while (run) {
            this.showMenu();
            select = Integer.valueOf(input.askStr("Select number : "));
            switch (select) {
                case 0:
                    System.out.println("=== Create a new Item ====");
                    System.out.print("Enter name: ");
                    String name = input.askStr("Enter name: ");
                    Item item = new Item(name);
                    tracker.add(item);
                    break;
                case 1:
                    System.out.println("=== Show all items ===");
                    Item[] items = tracker.findAll();
                    for (Item i : items) {
                        System.out.println(i.getName() + ", ID = " + i.getId());
                    }
                    break;
                case 2:
                    System.out.println("=== Edit Item ====");
                    name = input.askStr("Enter ID: ");
                    System.out.print("Enter name: ");
                    String name1 = input.askStr("Enter name: ");
                    item = new Item(name1);
                    item.setId(name);
                    flag = tracker.replace(name, item);
                    String str = flag ? "Операция успешна." : "Операция невозможна, нет такого ID.";
                    System.out.println(str);
                    break;
                case 3:
                    System.out.println("=== Delete Item ====");
                    name = input.askStr("Enter ID: ");
                    flag = tracker.delete(name);
                    str = flag ? "Операция успешна." : "Операция невозможна, нет такого ID.";
                    System.out.println(str);
                    break;
                case 4:
                    System.out.println("=== Find Item by ID ====");
                    name = input.askStr("Enter ID: ");
                    item = tracker.findById(name);
                    str = item == null ? "Операция невозможна, нет такого ID." : item.getName() + ", ID = " + item.getId();
                    System.out.println(str);
                    break;
                case 5:
                    System.out.println("=== Find Item by Name ====");
                    name = input.askStr("Enter Name: ");
                    items = tracker.findByName(name);
                    for (Item i : items) {
                        System.out.println(i.getName() + ", ID = " + i.getId());
                    }
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