package hw24;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course(1);
        c1.getLectures().add(new Lecture(1, "Lecture 1",
                new Homework(1, "do something"), new Materials(1, Type.URL)));
        c1.getLectures().add(new Lecture(2, "Lecture 2",
                new Homework(2, "do it again"), new Materials(2, Type.VIDEO)));

        Course c2 = new Course(2);
        c2.getLectures().add(new Lecture(1, "Lecture 1",
                new Homework(3, "do it in other way"), new Materials(3, Type.BOOK)));
        c2.getLectures().add(new Lecture(2, "Lecture 2",
                new Homework(4, "one mor time"), new Materials(4, Type.VIDEO)));

        List<Course> courseList = new ArrayList<>();
        courseList.add(c1);
        courseList.add(c2);

        Serialisation.serialiseCource(courseList);
        Serialisation.deserialiseCource(courseList);

    }
}