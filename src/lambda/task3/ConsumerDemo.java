package lambda.task3;

import java.util.function.Consumer;

/**
 * Написать лямбда выражение,
 * которое принимает на вход объект типа HeavyBox и выводит на консоль сообщение “Отгрузили ящик с весом n”.
 * “Отправляем ящик с весом n” Используем функциональный интерфейс Consumer и метод по умолчанию andThen.
 */

public class ConsumerDemo {

    public static void main(String[] args) {

        HeavyBox box = new HeavyBox(12);

        Consumer<HeavyBox> getBox = heavyBox ->
                System.out.printf(String.format("Отгрузили ящик весом %dкг.\n", heavyBox.getWeight()));

        Consumer<HeavyBox> sendBox = heavyBox ->
                System.out.printf(String.format("Отправляем ящик весом %dкг.\n", heavyBox.getWeight()));

        getBox.andThen(sendBox).accept(box);
    }
}
