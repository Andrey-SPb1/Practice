package dateTime.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

/**
 * Создайте объект класса LocalDate, указывая дату своего рождения.
 * Вывести на консоль день недели, день в году, месяц, год.
 * Создайте  объект класса LocalDate, представляющий текущее время.
 * Сравните его со своим днем рождения используя методы isAfter(), isBefore().
 */

public class DateTimeDemo {
    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(2000, 12,20);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("w, d, M, y"); // 51, 20, 12, 2000
        System.out.println(birthday.format(formatter));

        LocalDate now = LocalDate.now();
        System.out.println(now.isAfter(birthday)); // true
        System.out.println(now.isBefore(birthday)); // false
    }
}
