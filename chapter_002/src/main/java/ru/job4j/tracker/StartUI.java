package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        int select;
        boolean run = true;
        while (run) {
            this.showMenu();
            select = Integer.valueOf(scanner.nextLine());
            switch (select) {
                case 0:
                    System.out.println("=== Create a new Item ====");
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
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
                    System.out.print("Enter id: ");
                    name = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name1 = scanner.nextLine();
                    item = new Item(name1);
                    item.setId(name);
                    tracker.replace(name, item);
                    break;
                case 3:
                    System.out.println("=== Delete Item ====");
                    System.out.print("Enter id: ");
                    name = scanner.nextLine();
                    tracker.delete(name);
                    break;
                case 4:
                    System.out.println("=== Find Item by ID ====");
                    System.out.print("Enter ID: ");
                    name = scanner.nextLine();
                    item = tracker.findById(name);
                    System.out.println(item.getName() + ", ID = " + item.getId());
                    break;
                case 5:
                    System.out.println("=== Find Item by Name ====");
                    System.out.print("Enter Name: ");
                    name = scanner.nextLine();
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
        System.out.print("Select number : ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}