package collections.task3;

import java.util.*;

/**
 * Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
 * Избавиться от повторяющихся элементов в строке.
 * Вывести результат на экран.
 */

public class SetDemo {

    public static void main(String[] args) {

        SortedSet<Integer> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str," ,.");

        while(st.hasMoreTokens()) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        set.forEach(System.out::print); // 12345
    }
}
