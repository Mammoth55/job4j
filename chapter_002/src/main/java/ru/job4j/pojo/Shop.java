package ru.job4j.pojo;

public class Shop {

    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (Product i : products) {
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (i != null) {
                System.out.println(i.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1");
        //удаляем значение из ячейки с индексом 1
        products[1] = null;

        for (Product i : products) {
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (i != null) {
                System.out.println(i.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
        //записываем в ячейку с индексом 1 значение ячейки с индексом 2.
        products[1] = products[2];
        //удаляем значение из ячейки с индексом 2.
        products[2] = null;
        for (Product i : products) {
            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
            if (i != null) {
                System.out.println(i.getName());
            } else {
                System.out.println("null");
            }
        }
        // вызываем новый метод и проверяем выводом как обычно.
        System.out.println();
        System.out.println("Сдвигаем массив к ячейке с индексом 0");
        products = delete(products, 0);
        for (Product i : products) {
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (i != null) {
                System.out.println(i.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
