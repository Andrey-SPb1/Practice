package strings.task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Дана строка “Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”
 * Найти все подстроки "Java X" и распечатать их.
 */

public class RegexDemo {
    public static void main(String[] args) {
        String str = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        printJava(str);
    }

    private static void printJava(String text) {
        Pattern pattern = Pattern.compile("[Jj]ava\\s+[0-9]+");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
