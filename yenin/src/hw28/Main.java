package hw28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger.createFile(Logger.pathLogs);

        List<Matarials> m1 = new ArrayList<>();
        m1.add(new Matarials(0,Type.VIDEO));
        m1.add(new Matarials(1,Type.URL));
        m1.add(new Matarials(2,Type.BOOK));
        List<Matarials> m2 = new ArrayList<>();
        m2.add(new Matarials(3,Type.VIDEO));
        m2.add(new Matarials(4,Type.URL));
        List<Matarials> m3 = new ArrayList<>();
        m1.add(new Matarials(5,Type.VIDEO));


        Lecture l1 = new Lecture(1, "Arrays",
                LocalDateTime.of(2020, 1, 5, 12, 0));
        l1.setMaterials(m3);
        Lecture.lectures.add(l1);
        Lecture l2 = new Lecture(2, "Enum",
                LocalDateTime.of(2021, 5, 10, 12, 0));
        l2.setMaterials(m2);
        Lecture.lectures.add(l2);
        Lecture l3 = new Lecture(3, "List",
                LocalDateTime.of(2022, 12, 5, 12, 0));
        l3.setMaterials(m1);
        Lecture.lectures.add(l3);

        Person p1 = new Person(1, "Vlad", "Bedrytskiy","vlad@gmail.com");
        Person.persons.add(p1);
        Person p2 = new Person(2, "Bogdan", "Shelest", "shelest@gmail.com");
        Person.persons.add(p2);
        Person p3 = new Person(3, "Vlad", "Zhuravel", "vlad@gmail.com");

        p1.setEmail("q1@gmail.com");
        p1.setEmail("q1@gmail.com");

        Optional<Lecture> min = Lecture.lectures.stream()
                .min(Comparator.comparing(Lecture::getLocalDate));
        System.out.println("The earliest Lecture:");
        System.out.println(min);


        Optional<Lecture> max = Lecture.lectures.stream()
                .max(Comparator.comparing(Lecture -> Lecture.getMaterials().size()));
        System.out.println("Lecture with the most additional materials:");
        System.out.println(max);


        System.out.println("Quantity of INFO: " + Files.lines(Paths.get(Logger.pathLogs))
                .filter(s -> s.contains("INFO"))
                .count());
    }
}

