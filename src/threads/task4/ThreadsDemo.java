package threads.task4;

import java.util.*;

/**
 * Пять безмолвных философов сидят вокруг круглого стола, перед каждым философом стоит тарелка спагетти.
 * Вилки лежат на столе между каждой парой ближайших философов.
 * Каждый философ может либо есть, либо размышлять.
 * Философ может есть только тогда, когда держит две вилки — взятую справа и слева.
 * Взятие каждой вилки и возвращение её на стол являются раздельными действиями,
 * которые должны выполняться одно за другим.
 */

public class ThreadsDemo {

    public static void main(String[] args) throws InterruptedException {

        String food = "pasta";
        List<Thread> threadList = List.of(
                new Philosopher("Aristotle", food),
                new Philosopher("Confucius", food),
                new Philosopher("Marx", food),
                new Philosopher("Nietzsche", food),
                new Philosopher("Plato", food)
        );

        for (Thread thread : threadList) {
            thread.start();
        }

        for (Thread thread : threadList) {
            thread.join();
        }
    }
}
