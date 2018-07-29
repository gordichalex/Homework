package Lesson9.Task2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Comparator;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Вася", "Иванов", 20, 8),
                new Student("Стёпа", "Иванов", 25, 7),
                new Student("Гена", "Петров", 27, 9)
        );

        print(students);

        students.sort(
                Comparator.comparing(Student::getLastName)
                        .thenComparing(Comparator.comparing(Student::getFirstName))
                        .thenComparing(Comparator.comparing(Student::getAge))
                        .thenComparing(Student::getAverageValue)
        );
        print(students);
    }

    private static void print(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
}





