package dateTime.task2;

import java.time.LocalDate;

/**
 * Первая часть -> strings.task6;
 *
 * Добавить переменную LocalDate salaryDate в класс Employee (задание 7, Строки).
 * Создать класс FullReport, который выводит ту же информацию, что и Report и добавляет дату выдачи зарплаты.
 */

public class Runner {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ivan Ivanov",
                        30_000.21, LocalDate.of(2023, 3, 25)),
                new Employee("Sveta Smirnova",
                        35_000.00, LocalDate.of(2023, 4, 2)),
                new Employee("Maksim Cobolev",
                        20_000.21, LocalDate.of(2023, 4, 3)),
                new Employee("Maria Svetikova",
                        32_000.33, LocalDate.of(2023, 3, 27)),
                new Employee("Evgeniy Simonov",
                        24_000.17, LocalDate.of(2023, 3, 25)),
        };

//        Report.generateReport(employees);
        FullReport.generateFullReport(employees);
    }
}
