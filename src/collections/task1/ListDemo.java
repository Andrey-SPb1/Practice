package collections.task1;

import lambda.task3.HeavyBox;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Создать динамический массив, содержащий объекты класса HeavyBox.
 * Распечатать его содержимое используя for each.
 * Изменить вес первого ящика на 1.
 * Удалить последний ящик.
 * Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
 * Удалить все ящики.
 */

public class ListDemo {

    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(25));
        boxes.add(new HeavyBox(21));
        boxes.add(new HeavyBox(19));

        boxes.forEach(System.out::println);

        boxes.set(0, new HeavyBox(boxes.get(0).getWeight() - 1));
        System.out.println(boxes); // [HeavyBox{weight=24}, HeavyBox{weight=21}, HeavyBox{weight=19}]

        boxes.remove(boxes.size() - 1);
        System.out.println(boxes); // [HeavyBox{weight=24}, HeavyBox{weight=21}]

        HeavyBox[] boxes1 = boxes.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(boxes1)); // [HeavyBox{weight=24}, HeavyBox{weight=21}]

        HeavyBox[] boxes2 = new HeavyBox[boxes.size()];
        for (int i = 0; i < boxes2.length; i++) {
            boxes2[i] = boxes.get(i);
        }
        System.out.println(Arrays.toString(boxes2)); // [HeavyBox{weight=24}, HeavyBox{weight=21}]

        HeavyBox[] boxes3 = boxes.stream()
                .toArray(HeavyBox[]::new);
        System.out.println(Arrays.toString(boxes3)); // [HeavyBox{weight=24}, HeavyBox{weight=21}]

        boxes.clear();
        System.out.println(boxes); // []
    }
}
