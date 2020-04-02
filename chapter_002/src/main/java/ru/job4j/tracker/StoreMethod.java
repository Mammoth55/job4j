package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Random;

public interface StoreMethod {

    /**
     * Коллекция для хранения заявок.
     */
    Store ITEMS = new Store();

    Store findByName(String key);

    void add(Item item);

    Store findAll();

    int indexOf(String id);

    Item findById(String id);

    boolean replace(String id, Item item);

    boolean delete(String id);

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    default String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}
