package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println("Cats Name - " + this.name);
        System.out.println("Cats Food - " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("GAV");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("BLACK");
        black.eat("fish");
        black.show();
    }
}
