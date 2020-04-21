package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PhoneDictionary {

    private List<Person> persons = new ArrayList();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список найденных пользователей.
     */
    public List<Person> find(String key) {
        Predicate<Person> personName = (person) -> person.getName().contains(key);
        Predicate<Person> personSurName = (person) -> person.getSurname().contains(key);
        Predicate<Person> personPhone = (person) -> person.getPhone().contains(key);
        Predicate<Person> personAddress = (person) -> person.getAddress().contains(key);
        var combine = personName.or(personSurName).or(personPhone).or(personAddress);
        var result = new ArrayList();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}