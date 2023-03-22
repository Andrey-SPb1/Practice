package strings.task2;

/**
 * Дано два числа, например 3 и 56, необходимо составить следующие строки:
 * 3 + 56 = 59
 * 3 – 56 = -53
 * 3 * 56 = 168.
 * Используем метод StringBuilder.append().
 * Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
 * Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
 */

public class StringBuilderDemo {
    public static void main(String[] args) {

        int value1 = 3;
        int value2 = 56;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(value1).append(" + ").append(value2).append(" = ").append(value1 + value2);
        System.out.println(stringBuilder); // 3 + 56 = 59

        stringBuilder = new StringBuilder();
        stringBuilder.append(value1).append(" - ").append(value2).append(" = ").append(value1 - value2);
        System.out.println(stringBuilder); // 3 - 56 = -53

        stringBuilder = new StringBuilder();
        stringBuilder.append(value1).append(" * ").append(value2).append(" = ").append(value1 * value2);
        System.out.println(stringBuilder); // 3 * 56 = 168

        int indexOf = stringBuilder.indexOf("=");
//        stringBuilder.deleteCharAt(indexOf);
//        stringBuilder.insert(indexOf, "равно");
//        System.out.println(stringBuilder); // 3 * 56 равно 168

        stringBuilder.replace(indexOf, indexOf + "=".length(), "равно");
        System.out.println(stringBuilder); // 3 * 56 равно 168
    }
}
