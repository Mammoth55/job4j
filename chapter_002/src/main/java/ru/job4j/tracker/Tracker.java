package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Tracker implements StoreMethod {

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    @Override
    public void add(Item item) {
        item.setId(generateId());
        ITEMS.add(item);
    }

    /**
     * Метод находит и возращает коллекцию из оставленных заявок.
     * @return массив только из оставленных заявок.
     */
    @Override
    public Store findAll() {
        return ITEMS;
    }

    /**
     * Метод находит и возращает коллекцию из заявок, с полем name идентичным ключу key.
     * @param key ключ для поиска по коллекции заявок.
     * @return коллекция только из заявок с соответствующим значением поля Name.
     */
    @Override
    public Store findByName(String key) {
        Store out = new Store();
        for (Item i : ITEMS) {
            if (i.getName().equals(key)) {
                out.add(i);
            }
        }
        return out;
    }

    /**
     * Метод находит и возращает индекс заявки, с полем id идентичным ключу id.
     * @param id уникальный идентификатор для поиска по коллекции заявок.
     * @return индекс заявки с соответствующим значением поля id, если найден, иначе -1.
     */
    @Override
    public int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < ITEMS.size(); index++) {
            if (ITEMS.get(index).getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод находит и возращает заявку, с полем id идентичным ключу id.
     * @param id уникальный идентификатор для поиска по коллекции заявок.
     * @return заявка с соответствующим значением поля id.
     */
    @Override
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? ITEMS.get(index) : null;
    }

    /**
     * Метод находит и заменяет на заявку item заявку, с полем id идентичным ключу id.
     * @param id уникальный идентификатор для поиска по коллекции заявок.
     * @param item заявка для замены.
     * @return флаг выполнения операции, если id не найден то false, иначе true.
     */
    @Override
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        if (index >= 0) {
            item.setId(id);
            ITEMS.set(index, item);
            return  true;
        } else {
            return false;
        }
    }

    /**
     * Метод находит и удаляет заявку, с полем id идентичным ключу id.
     * @param id уникальный идентификатор для поиска по коллекции заявок.
     * @return флаг выполнения операции, если id не найден то false, иначе true.
     */
    @Override
    public boolean delete(String id) {
        int i = indexOf(id);
        if (i >= 0) {
            ITEMS.remove(i);
            return true;
        } else {
            return false;
        }
    }
}
