package collections.task6;

import lambda.task3.HeavyBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Создать коллекцию, содержащую объекты HeavyBox.
 * Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
 * Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
 */

public class SeparationListDemo {
    private static List<HeavyBox> heavyBoxes;
    private static List<HeavyBox> lightBoxes;

    public static void main(String[] args) {

        List<HeavyBox> boxes = List.of(
                new HeavyBox(450),
                new HeavyBox(240),
                new HeavyBox(320),
                new HeavyBox(200),
                new HeavyBox(370),
                new HeavyBox(190)
        );
        separationBoxes(boxes);

        System.out.println(boxes);
        System.out.println(heavyBoxes); // [HeavyBox{weight=450}, HeavyBox{weight=320}, HeavyBox{weight=370}]
        System.out.println(lightBoxes); // [HeavyBox{weight=240}, HeavyBox{weight=200}, HeavyBox{weight=190}]
    }
    private static void separationBoxes(List<HeavyBox> boxes) {
        heavyBoxes = new ArrayList<>();
        lightBoxes = new ArrayList<>();
        for (HeavyBox box : boxes) {
            if(box.getWeight() > 300) heavyBoxes.add(box);
            else lightBoxes.add(box);
        }
    }
}
