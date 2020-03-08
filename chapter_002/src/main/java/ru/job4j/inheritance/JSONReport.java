package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        String crLf = System.lineSeparator();
        return "{" + crLf
                + crLf
                + name + " : " + name + "," + crLf
                + body + " : " + body + crLf
                + crLf
                + "}.";
    }
}
