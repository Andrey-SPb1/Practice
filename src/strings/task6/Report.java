package strings.task6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.io.File;

public class Report {
    public static void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            employee.printInfo();
        }
    }

    public static void printReportToFile(Employee[] employees) {
        File file = Path.of("src", "strings", "task6", "report.txt").toFile();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {

            for (Employee employee : employees) {
                bufferedWriter.write(employee.info());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
