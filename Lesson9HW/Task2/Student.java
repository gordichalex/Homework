package Lesson9.Task2;

public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private int age;
    private double averageValue;

    public Student(String firstName, String lastName, int age, double averageValue) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageValue = averageValue;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(double averageValue) {
        this.averageValue = averageValue;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", averageValue=" + averageValue +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.firstName.compareTo(o.firstName);
    }
}



