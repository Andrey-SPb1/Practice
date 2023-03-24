package collections.task2;

import lambda.task3.HeavyBox;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Создать TreeSet содержащий HeavyBox.
 * HeavyBox должен реализовать интерфейс Comparable.
 * Распечатать содержимое с помощью for each.
 */

public class TreeSetDemo {

    public static void main(String[] args) {

        SortedSet<HeavyBox> set = new TreeSet<>();
        set.add(new HeavyBox(20));
        set.add(new HeavyBox(17));
        set.add(new HeavyBox(12));
        set.add(new HeavyBox(34));
        set.add(new HeavyBox(17));

        set.forEach(System.out::println);
    }
}
