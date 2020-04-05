package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tracker {

    /**
     * хранилище для заявок.
     */
    private final List<Item> items = new ArrayList();

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    public String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public void add(Item item) {
        item.setId(generateId());
        items.add(item);
    }

    /**
     * Метод находит и возращает хранилище оставленных заявок.
     * @return массив только из оставленных заявок.
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * Метод находит и возращает хранилище заявок, с полем name идентичным ключу key.
     * @param key ключ для поиска по коллекции заявок.
     * @return хранилище только из заявок с соответствующим значением поля Name.
     */
    public List<Item> findByName(String key) {
        List<Item> out = new ArrayList();
        for (Item i : items) {
            if (i.getName().equals(key)) {
                out.add(i);
            }
        }
        return out;
    }

    /**
     * Метод находит и возращает индекс заявки, с полем id идентичным ключу id.
     * @param id уникальный идентификатор для поиска по хранилищу заявок.
     * @return индекс заявки с соответствующим значением поля id, если найден, иначе -1.
     */
    public int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод находит и возращает заявку, с полем id идентичным ключу id.
     * @param id уникальный идентификатор для поиска по хранилищу заявок.
     * @return заявка с соответствующим значением поля id.
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    /**
     * Метод находит и заменяет на заявку item заявку, с полем id идентичным ключу id.
     * @param id уникальный идентификатор для поиска по хранилищу заявок.
     * @param item заявка для замены.
     * @return флаг выполнения операции, если id не найден то false, иначе true.
     */
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        if (index >= 0) {
            item.setId(id);
            items.set(index, item);
            return  true;
        } else {
            return false;
        }
    }

    /**
     * Метод находит и удаляет заявку, с полем id идентичным ключу id.
     * @param id уникальный идентификатор для поиска по хранилищу заявок.
     * @return флаг выполнения операции, если id не найден то false, иначе true.
     */
    public boolean delete(String id) {
        int i = indexOf(id);
        if (i >= 0) {
            items.remove(i);
            return true;
        } else {
            return false;
        }
    }
}
