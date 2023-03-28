package threads.task3;

import java.util.StringTokenizer;

/**
 * Необходимо создать три потока, которые изменяют один и тот же объект.
 * Каждый поток должен вывести на экран одну букву 100 раз, и затем увеличить значение символа на 1.
 *
 * Создать класс расширяющий Thread.
 * Переопределить метод run() - здесь будет находиться синхронизированный блок кода.
 * Для того чтобы три объекта потока имели доступ к одному объекту,
 * создаем конструктор принимающий на вход StringBuilder объект.
 * Синхронизированный блок кода будет получать монитор на объект StringBuilder из пункта 3.
 * Внутри синхронизированного блока кода выведите StringBuilder на экран 100 раз,
 * а потом увеличьте значение символа на 1.
 * В методе main() создайте один объект класса StringBuilder, используя символ ‘a’.
 * Затем создайте три экземпляра объекта нашего класса и запустите потоки.
 */

public class SynchronizedDemo {

    public static void main(String[] args) throws InterruptedException {

        StringBuilder stringBuilder = new StringBuilder('a');

        Thread thread1 = new NewThread(stringBuilder);
        Thread thread2 = new NewThread(stringBuilder);
        Thread thread3 = new NewThread(stringBuilder);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(stringBuilder.length());

    }
}
