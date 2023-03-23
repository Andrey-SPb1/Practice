package strings.task8;

import java.util.*;

/**
 * Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры.
 * Если таких слов несколько, найти первое из них.
 * Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 */

public class MinSymbolRunner {

    public static void main(String[] args) {

        String text = """
                Эффективным алгоритмом для определения хеш-кода объекта является такой алгоритм,
                который ровным слоем распределяет объекты по хеш-таблице. Вообще создание такого алгоритма,
                это достаточно сложный процесс, на котором защищают докторские диссертации.
                Но хорошей новостью является то, что на самом деле Вам не нужно придумывать свой алгоритм.
                В средствах разработки, в частности в IntelliJ IDEA, существует генератор, который сгенерирует
                Вам метод hashCode(). Обычно все пользуются этим вариантом создания метода.
                """;

        System.out.println(minSymbol(text)); // В
    }
    private static String minSymbol(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        String result = "";
        int amountDifferentSymbol = str.length();

        while(stringTokenizer.hasMoreTokens()) {
            String word = stringTokenizer.nextToken();
            char[] symbols = word.toCharArray();
            Set <Character> set = new HashSet<>();
            for (char symbol : symbols) {
                set.add(symbol);
            }
            if(set.size() < amountDifferentSymbol) {
                result = word;
                amountDifferentSymbol = set.size();
            }
        }
        return result;
    }
}
