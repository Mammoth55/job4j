package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {

    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     * Также по сути является кол-вом заявок в массиве (индекс наполненности).
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public void add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        // return item;
    }

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
     * Метод находит и возращает массив из оставленных заявок.
     * Попутно метод дефрагментируем массив, вытесняя элементы NULL выше.
     * @return массив только из оставленных заявок.
     */
    public Item[] findAll() {
        int size = 0;
        Item[] itemsWithoutNull = new Item[this.position];
        for (int i = 0; i < this.position; i++) {
            if (this.items[i] != null) {
                itemsWithoutNull[size++] = this.items[i];
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
        return itemsWithoutNull;
    }

    /**
     * Метод находит и возращает массив из заявок, с полем name идентичным ключу key.
     * @param key ключ для поиска по массиву заявок.
     * @return массив только из заявок с соответствующим значением поля Name.
     */
    public Item[] findByName(String key) {
        Item[] out = new Item[this.position];
        int size = 0;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getName().equals(key)) {
                out[size++] = this.items[i];
            }
        }
        out = Arrays.copyOf(out, size);
        return out;
    }


    /**
     * Метод находит и возращает заявку, с полем id идентичным ключу id.
     * @param id уникальный идентификатор для поиска по массиву заявок.
     * @return заявкf с соответствующим значением поля id.
     */
    public Item findById(String id) {
        for (Item i : this.items) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        return null;
    }
}
