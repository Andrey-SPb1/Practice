package strings.task1;

/**
 * Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
 * Распечатать последний символ строки. Используем метод String.charAt().
 * Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
 * Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
 * Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
 * Найти позицию подстроки “Java” в строке “I like Java!!!”.
 * Заменить все символы “а” на “о”.
 * Преобразуйте строку к верхнему регистру.
 * Преобразуйте строку к нижнему регистру.
 * Вырезать строку Java c помощью метода String.substring().
 */

public class StringDemo {
    public static void main(String[] args) {

        String text = "I like Java!!!";

        System.out.println(text.charAt(text.length() - 1)); // !
        System.out.println(text.endsWith("!!!")); // true
        System.out.println(text.startsWith("I like")); // true
        System.out.println(text.contains("Java")); // true
        int indexOf = text.indexOf("Java");
        System.out.println(indexOf); // 7
        System.out.println(text.replace("a", "o")); // I like Jovo!!!
        System.out.println(text.toUpperCase()); // I LIKE JAVA!!!
        System.out.println(text.toLowerCase()); // i like java!!!
        System.out.println(text.substring(indexOf,indexOf + "Java".length())); // Java
    }

}
