package hw21;
import java.util.Comparator;

public class ComparatorByTime implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getTestDoneTime() - o2.getTestDoneTime() ;
    }
}
