package dateTime.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Employee {

    private final String fullName;
    private final double salary;
    private final LocalDate dateSalary;

    public Employee(String fullName, double salary, LocalDate dateSalary) {
        this.fullName = fullName;
        this.salary = salary;
        this.dateSalary = dateSalary;
    }
    public void printInfoSalary(){
        System.out.printf(String.format("Зарплата %-25s %,.2f\n", fullName, salary));
    }
    public void printFullInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.y");
        System.out.printf(String.format("Зарплата %-20s %,-10.2f выплата: %s\n",
                fullName, salary, dateSalary.format(formatter)));
    }
}
