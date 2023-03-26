package strings.task6;

/**
 * 1.
 * Создать класс Employee, у которого есть переменные класса - fullname, salary.
 * Создать массив содержащий несколько объектов этого типа.
 * Создать класс Report  со статическим методом generateReport,
 * в котором выводится информация о зарплате всех сотрудников.
 * Используйте форматирование строк. Пусть salary будет выровнено по правому краю,
 * десятичное значение имеет 2 знака после запятой и можете добавить что-нибудь свое.
 *
 * 2(IO).
 * Добавить метод в класс Employee, который будет записывать отчет в файл.
 * Используем класс PrintWriter.
 */

public class Runner {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ivan Ivanov", 30_000.21),
                new Employee("Sveta Smirnova", 35_000.00),
                new Employee("Maksim Cobolev", 20_000.21),
                new Employee("Maria Svetikova", 32_000.33),
                new Employee("Evgeniy Simonov", 24_000.17),
        };

        Report.generateReport(employees);
        Report.printReportToFile(employees);
    }
}
