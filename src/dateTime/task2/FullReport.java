package dateTime.task2;

public class FullReport {

    public static void generateFullReport(Employee[] employees) {
        for (Employee employee : employees) {
            employee.printFullInfo();
        }
    }
}
