package hw20;

import java.util.Comparator;

public class ComparatorByLectureName implements Comparator<Lecture> {
    @Override
    public int compare(Lecture o1, Lecture o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
