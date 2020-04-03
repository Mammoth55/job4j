package ru.job4j.tracker;

public class Tracker implements StoreMethod {

    /**
     * хранилище для заявок.
     */
    private final Store items = new Store();

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    @Override
    public void add(Item item) {
        item.setId(generateId());
        items.add(item);
    }

    /**
     * Метод находит и возращает хранилище оставленных заявок.
     * @return массив только из оставленных заявок.
     */
    @Override
    public Store findAll() {
        return items;
    }

    /**
     * Метод находит и возращает хранилище заявок, с полем name идентичным ключу key.
     * @param key ключ для поиска по коллекции заявок.
     * @return хранилище только из заявок с соответствующим значением поля Name.
     */
    @Override
    public Store findByName(String key) {
        Store out = new Store();
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
    @Override
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
    @Override
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
    @Override
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
    @Override
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
