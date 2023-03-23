package lambda.task2;

import java.util.function.Predicate;

/**
 * Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”.
 * Используем функциональный интерфейс Predicate;
 */
public class LambdaDemo2 {

    public static void main(String[] args) {
        String test1 = "Java";
        String test2 = "Nasa";
        String test3 = "Test";
        String test4 = "John";
        String test5 = "Data";

        Predicate<String> predicate = (String test) -> {
            return test.toUpperCase().endsWith("A") &&
                    (test.toUpperCase().startsWith("J") || test.toUpperCase().startsWith("N"));
        };

        System.out.println(predicate.test(test1)); // true
        System.out.println(predicate.test(test2)); // true
        System.out.println(predicate.test(test3)); // false
        System.out.println(predicate.test(test4)); // false
        System.out.println(predicate.test(test5)); // false
    }
}
