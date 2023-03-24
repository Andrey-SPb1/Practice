package collections.task7;

import java.util.*;

/**
 * Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
 * Перебрать и распечатать пары значений - entrySet().
 * Перебрать и распечатать набор из имен продуктов  - keySet().
 * Перебрать и распечатать значения продуктов - values().
 * Для каждого перебора создать свой метод.
 */

public class HashMapDemo {

    public static void main(String[] args) {

        List<Product> toys = Arrays.asList(
                new Product("doll"),
                new Product("car"),
                new Product("castle"),
                new Product("ball"),
                new Product("bear")
        );

        Map<String, Product> hashMap = new HashMap<>();
        for (Product toy : toys) {
            hashMap.put(toy.getName(), toy);
        }

        printEntriesSet(hashMap);
        printKeysSet(hashMap);
        printValuesSet(hashMap);
    }
    private static void printEntriesSet(Map<String, Product> map) {
        for (Map.Entry<String, Product> productEntry : map.entrySet()) {
            System.out.println(productEntry);
        }
    }
    private static void printKeysSet(Map<String, Product> map) {
        for (String name : map.keySet()) {
            System.out.println(name);
        }
    }
    private static void printValuesSet(Map<String, Product> map) {
        for (Product product : map.values()) {
            System.out.println(product);
        }
    }
}
