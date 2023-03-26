package strings.task6;

public class Employee {

    private final String fullName;
    private final double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }
    public void printInfo(){
        System.out.printf(String.format("Зарплата %-25s %,.2f\n", fullName, salary));
    }
    public String info() {
        return String.format("Зарплата %-25s %.2f\n", fullName, salary);
    }
}
