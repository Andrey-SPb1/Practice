package strings.task9;

import java.util.*;
import java.util.regex.*;

/**
 * Предложение состоит из нескольких слов, например:
 * "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554".
 * Среди слов, состоящих только из цифр, найти слово палиндром.
 */
public class ReverseDemo {

    public static void main(String[] args) {
        String text = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
        System.out.println(numPalindrome(text)); // 1 111 4554
    }

    private static String numPalindrome(String text) {
        StringBuilder result = new StringBuilder();

        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            String strValue = matcher.group();
            StringBuilder stringBuilder = new StringBuilder(strValue);
            int value = Integer.parseInt(strValue);
            int valueReverse = Integer.parseInt(stringBuilder.reverse().toString());
            if (valueReverse == value) result.append(value).append(" ");
        }
        return result.toString();
    }
}
