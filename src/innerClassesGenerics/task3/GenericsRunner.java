package innerClassesGenerics.task3;

import java.io.*;

/**
 * Создать обобщенный класс с тремя параметрами (T, V, K).
 * Класс содержит три переменные типа (T, V, K), конструктор,
 * принимающий на вход параметры типа (T, V, K), методы возвращающие значения трех переменных.
 * Создать метод, выводящий на консоль имена классов для трех переменных класса.
 * Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (классы оболочки, String),
 * V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.
 */
public class GenericsRunner {

    public static void main(String[] args) {

        GenericDemo<? extends Comparable<String>,? extends Serializable, ? extends Number> genericDemo =
                new GenericDemo<>("Test", new Animal(), new Number());

        System.out.println(genericDemo.getClassesName()); // String Animal Number
    }

}
