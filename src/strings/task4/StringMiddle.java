package strings.task4;

/**
 * Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака.
 * Например,
 * если дана строка "string"  результат будет "ri", для строки "code" результат "od",  для "Practice" результат "ct".
 */

public class StringMiddle {
    public static void main(String[] args) {
        String[] strings = {
                "string",
                "code",
                "Practice",
        };
        for (String string : strings) {
            System.out.println(stringMid(string));
        }
    }
    private static String stringMid(String str) {
        int lengthHalf = str.length()/2;
        return str.charAt(lengthHalf - 1) + "" + str.charAt(lengthHalf);
    }
}
