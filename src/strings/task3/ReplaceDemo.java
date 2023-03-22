package strings.task3;

import java.util.StringTokenizer;

/**
 * Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming»
 * (не учитываем регистр символов) на «OOP». Например, строка
 * "Object-oriented programming is a programming language model organized around objects rather than "actions"
 * and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."
 * должна быть преобразована в
 * "Object-oriented programming is a programming language model organized around objects rather than "actions"
 * and data rather than logic. OOP blabla. Object-oriented programming bla."
 */

public class ReplaceDemo {
    public static void main(String[] args) {

        String text = """
                Object-oriented programming is a programming language model organized around\s
                objects rather than "actions" and data rather than logic. Object-oriented programming blabla.
                Object-oriented programming bla.
                """;
        String target = "Object-oriented programming";
        String str = "OOP";

        String result = replaceString(text, target,str);
        System.out.println(result);
    }

    private static String replaceString(String text, String target, String str) {
        StringBuilder result = new StringBuilder(text);
        int correct = 0, // Количество проверок
                index = result.indexOf(target); // Позиция в строке
        while(index != -1) {
            if (++correct%2 == 0) { // Инкремент переменной и проверка является ли она четной
                result.replace(index, index + target.length(), str);
                index += str.length(); // Сдвигаем курсор на длину замены
            } else index += target.length(); // Иначе сдвигаем на длину цели
            index = result.indexOf(target, index); // Переход к следущей строке, если такой нет присвается -1;
        }
        return String.valueOf(result);
    }
}
