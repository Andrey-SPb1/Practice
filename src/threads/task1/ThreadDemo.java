package threads.task1;

/**
 * Создать класс NewThread расширяющий Thread.
 * Переопределить метод run(). В цикле for вывести на консоль символ 100 раз.
 * Создать экземпляр класса и запустить новый поток.
 */

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new NewThread();
        Thread thread2 = new NewThread();
        Thread thread3 = new NewThread();

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
    }
}
