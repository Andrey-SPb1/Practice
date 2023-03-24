package collections.task8;

public class Student {

    private final String lastName;
    private String group;
    private int course;
    private double GPA;

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", GPA=" + GPA +
                '}';
    }

    public Student(String lastName, String group, int course, double GPA) {
        this.lastName = lastName;
        this.group = group;
        this.course = course;
        this.GPA = GPA;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public double getGPA() {
        return GPA;
    }
}
