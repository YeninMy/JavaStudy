package hw26;


import java.awt.*;
import java.time.LocalDateTime;

import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Lecture.lectures.add(new Lecture(1, "Enum",
                LocalDateTime.of(2023, 1, 5, 12, 0),
                new Materials(1, Type.URL)));
        Lecture.lectures.add(new Lecture(2, "Interface",
                LocalDateTime.of(1995, 5, 15, 12, 0),
                new Materials(2, Type.VIDEO)));
        Lecture.lectures.add(new Lecture(3, "Map",
                LocalDateTime.of(2000, 1, 1, 12, 0),
                new Materials(3, Type.BOOK)));
        Lecture.lectures.add(new Lecture(4, "Date",
                LocalDateTime.of(2020, 4, 11, 12, 0),
                new Materials(4, Type.URL)));
        Lecture.lectures.add(new Lecture(4, "Classes",
                LocalDateTime.of(1995, 5, 5, 12, 0),
                new Materials(4, Type.URL)));

        Lecture.printLectures();

        Comparator comp = Comparator.comparing(Lecture::getDate);
        Collections.sort(Lecture.lectures, comp);
        System.out.println("----------------------");
        Lecture.printLectures();

    }
}