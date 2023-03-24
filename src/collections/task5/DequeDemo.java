package collections.task5;

import lambda.task3.HeavyBox;

import java.util.ArrayDeque;

/**
 * Создать очередь, содержащую объекты класса HeavyBox.
 * Используем класс ArrayDeque.
 * Поместить объекты в очередь с помощью метода offer().
 * Удалить объекты методом poll().
 */

public class DequeDemo {

    public static void main(String[] args) {

        ArrayDeque<HeavyBox> boxes = new ArrayDeque<>();

        boxes.offer(new HeavyBox(21));
        boxes.offerFirst(new HeavyBox(13));
        boxes.offerLast(new HeavyBox(17));
        boxes.offerFirst(new HeavyBox(24));
        boxes.offer(new HeavyBox(18));

        while(boxes.peek() != null) {
            HeavyBox box = boxes.poll();
            System.out.printf(String.format("Коробка весом %dкг была удалена из очереди\n", box.getWeight()));
        }

        System.out.println(boxes); // []
    }
}
