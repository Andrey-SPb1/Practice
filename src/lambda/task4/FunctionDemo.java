package lambda.task4;

import java.util.function.Function;

/**
 * Написать лямбда выражение,
 * которое принимает на вход число и возвращает значение “Положительное число”,
 * “Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.
 */

public class FunctionDemo {

    public static void main(String[] args) {

        Function<Integer, String> function = (value) -> {
            if (value > 0) return "Положительное число";
            else if (value == 0) return "Ноль";
            else return "Отрицательное число";
        };

        System.out.println(function.apply(5));
        System.out.println(function.apply(0));
        System.out.println(function.apply(-2));
    }
}
