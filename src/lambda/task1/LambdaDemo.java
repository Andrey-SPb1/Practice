package lambda.task1;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Создать лямбда выражение, которое возвращает значение true,
 * если строка не null, используя функциональный интерфейс Predicate.
 * Создать лямбда выражение, которое проверяет, что строка не пуста,
 * используя функциональный интерфейс Predicate.
 * Написать программу проверяющую, что строка не null и не пуста,
 * используя метод and() функционального интерфейса Predicate.
 */

public class LambdaDemo {

    private final static String DELIMITER = "--------------";

    public static void main(String[] args) {
        String test1 = "Test ";
        String test2 = null;
        String test3 = "";

        Predicate<String> predicate1 = Objects::nonNull;
        System.out.println(predicate1.test(test1)); // true
        System.out.println(predicate1.test(test2)); // false
        System.out.println(predicate1.test(test3)); // false

        System.out.println(DELIMITER);

        Predicate<String> predicate2 = String::isEmpty;
        System.out.println(predicate2.test(test1)); // false
//        System.out.println(predicate2.test(test2)); // Error
        System.out.println(predicate2.test(test3)); // true

        System.out.println(DELIMITER);

        System.out.println(predicate2.and(predicate1).test(test1)); // false
        System.out.println(predicate1.and(predicate2).test(test2)); // При вызове and() из predicate2 будет ошибка
        System.out.println(predicate2.and(predicate1).test(test3)); // true
    }
}
