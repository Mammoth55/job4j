package ru.job4j.search;

import ru.job4j.lambda.FuncInDiapason;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PhoneDictionary {

    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список найденных пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> personName = (person) -> person.getName().contains(key);
        Predicate<Person> personSurName = (person) -> person.getSurname().contains(key);
        Predicate<Person> personPhone = (person) -> person.getPhone().contains(key);
        Predicate<Person> personAddress = (person) -> person.getAddress().contains(key);
        Predicate<Person> combine = personName.or(personSurName).or(personPhone).or(personAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}