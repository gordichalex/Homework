package Lesson9.Task2;

import java.util.Comparator;
public class AverageValueComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2){
        return Double.compare(o1.getAverageValue(), o2.getAverageValue());
    }
}
