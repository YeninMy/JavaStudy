package hw24;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Course implements Serializable {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private List<Lecture> lectures = new ArrayList<>();

    public List<Lecture> getLectures() {
        return lectures;
    }

    public Course(int id) {
        this.id = id;
    }

    public void printCource() {
        System.out.println("Course " + id);
        for (int i = 0; i < lectures.size(); i++) {
            System.out.println(lectures.get(i));
        }
    }


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                '}';
    }
}
