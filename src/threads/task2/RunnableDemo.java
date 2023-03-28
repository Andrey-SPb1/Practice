package threads.task2;

/**
 * Создать класс, реализующий интерфейс Runnable.
 * Переопределить run() метод. Создать цикл for.
 * В цикле распечатываем значения от 0 до 100 делящиеся на 10 без остатка.
 * Используем статический метод Thread.sleep(), чтобы сделать паузу.
 * Создать три потока, выполняющих задачу распечатки значений.
 */
public class RunnableDemo {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new NewRunnable());
        Thread thread2 = new Thread(new NewRunnable());
        Thread thread3 = new Thread(new NewRunnable());

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
