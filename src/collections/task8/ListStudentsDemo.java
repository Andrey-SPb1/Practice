package collections.task8;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
 * Создать коллекцию, содержащую объекты класса Student.
 * Написать метод, который удаляет студентов со средним баллом <3.
 * Если средний балл>=3, студент переводится на следующий курс.
 * Напишите метод printStudents(List<Student> students, int course), который получает список студентов и номер курса.
 * А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.
 */

public class ListStudentsDemo {

    public static void main(String[] args) {

        List<Student> studentList = List.of(
                new Student("Иванов", "P162", 3,3.9),
                new Student("Смирнова", "G212", 2,3.3),
                new Student("Смирнов", "P162", 3,2.8),
                new Student("Соболев", "G211", 1,3.7),
                new Student("Козлова", "G211", 4,4.7),
                new Student("Яковлев", "P162", 3,2.5),
                new Student("Морозова", "G211", 1,4.1),
                new Student("Петров", "G212", 2,4.9)
        );

        printStudentsThisCourse(studentList, 3);

        studentList = endYear(studentList);
        System.out.println(studentList);

        printStudentsThisCourse(studentList,4);
    }
    private static List<Student> endYear(List<Student> studentList) {

        List<Student> newList = new ArrayList<>();

        for (Student student : studentList) {
            String lastName = student.getLastName();
            if(student.getGPA() < 3) System.out.printf("%s отчислен за неуспеваемость\n", lastName);
            else {
                int course = student.getCourse();
                if (course == 4) System.out.
                        printf("%s окончил университет со средним балом %.1f\n", lastName,student.getGPA());
                else {
                    student.setCourse(++course);
                    newList.add(student);
                    System.out.printf("%s переходит на %d-й курс\n", lastName, course);
                }
            }
        }

        return newList;
    }

    private static void printStudentsThisCourse(List<Student> studentList, int course) {

        System.out.printf("На %d-м курсе обучаются:\n", course);
        for (Student student : studentList) {
            if(student.getCourse() == course) System.out.println(student.getLastName());
        }
    }
}
