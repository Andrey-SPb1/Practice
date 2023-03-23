package lambda.task6;

/**
 * Написать лямбда выражение для интерфейса Printable, который содержит один метод void print().
 * Переделать класс использующий Printable используя ссылку на статический метод.
 */
public class PrintableDemo {

    public static void main(String[] args) {
        String test = "Test";

        Printable printable = PrintableDemo::printOut;

        printable.print("Test");
    }
    public static void printOut(String str) {
        System.out.println(str);
    }
}
