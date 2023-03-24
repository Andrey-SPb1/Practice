package collections.task4;

/**
 * Напишите методы union(Set<?>... set) и intersect(Set<?> ... set),
 * реализующих операции объединения и пересечения множеств.
 * Протестируйте работу этих методов на предварительно заполненных множествах.
 */

import java.util.*;

public class CollectionUtilsDemo {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(5, 3, 2, 1, 8, 4, 9);
        List<Integer> list2 = Arrays.asList(4, 3, 7, 4, 6, 1, 7);

        Set<Integer> result = new TreeSet<>();
        result = union(list1,list2);
        System.out.println(result); // [1, 2, 3, 4, 5, 6, 7, 8, 9]

        result = intersect(list1,list2);
        System.out.println(result); // [1, 3, 4]
    }
    private static Set<Integer> union(List<Integer> list1, List<Integer> list2) {
        Set<Integer> result = new TreeSet<>();
        result.addAll(list1);
        result.addAll(list2);

        return result;
    }
    private static Set<Integer> intersect(List<Integer> list1, List<Integer> list2) {
        Set<Integer> result = new TreeSet<>();
        for (Integer intList1 : list1) {
            for (Integer intList2 : list2) {
                if(intList1 == intList2) result.add(intList1);
            }
        }
        return result;
    }
}
