package dateTime.task2;

public class Report {
    public static void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            employee.printInfoSalary();
        }
    }
}
