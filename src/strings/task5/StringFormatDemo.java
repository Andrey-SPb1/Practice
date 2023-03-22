package strings.task5;

/**
 * Создать строку, используя форматирование: Студент [Фамилия] получил [оценка] по [предмету].
 * Форматирование и вывод строки на консоль написать в отдельном методе, который принимает фамилию,
 * оценку и название предмета в качестве параметров.
 * Выделить под фамилию 15 символов, под оценку 3 символа, под предмет – 10.
 *
 * Пример вывода:
 * Студент Иванов получил 5 по Математике
 * Студент Петрова получил 4 по Физике
 * Студент Сидорова получил 3 по Программированию
 */

public class StringFormatDemo {
    public static void main(String[] args) {
        stringFormat("Иванов", 5, "Математика");
        stringFormat("Петрова", 4, "Физика");
        stringFormat("Сидорова", 3, "Программирование");
    }
    private static void stringFormat(String lastName, int grade, String classes){
        if(classes != null) {
            if (classes.charAt(classes.length() - 1) == 'а' || classes.charAt(classes.length() - 1) == 'я')
                classes = classes.substring(0, classes.length() - 1) + "е";
            else if (classes.charAt(classes.length() - 1) == 'е')
                classes = classes.substring(0, classes.length() - 1) + "ю";
        }
        String result = String.format("Студент %s получил %d по %s", lastName, grade, classes);

        System.out.println(result);
    }
}
