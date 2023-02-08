package hw26;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Lecture {
    private int id;
    private String name;
    private LocalDateTime date;
    private Material material;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Material getMaterials() {
        return material;
    }

    public void setMaterials(Material material) {
        this.material = material;
    }

    public Lecture(int id, String name, LocalDateTime date, Material material) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.material = material;
    }

    DateTimeFormatter lecFormatter = DateTimeFormatter.ofPattern("yyy MMM d, HH:mm", Locale.ENGLISH);

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + lecFormatter.format(date) +
                ", materials=" + material +
                '}';
    }

    static List<Lecture> lectures = new ArrayList();

    public static void printLectures() {
        for (Lecture lecture : lectures) {
            System.out.println(lecture);
        }
    }

    public static void printLecturesById() {
        lectures.sort((l1, l2) -> Integer.compare(l1.getId(), (l2.getId())));
        printLectures();
    }

    public static void printLecturesByDate() {
        lectures.sort((l1, l2) -> l1.getDate().compareTo(l2.getDate()));
        printLectures();
    }

    public static void printLecturesFromDate(LocalDate date) {
        lectures.sort((l1, l2) -> l1.getDate().compareTo(l2.getDate()));
        for (Lecture lecture : lectures) {
            if (lecture.getDate().isAfter(date.atStartOfDay())) {
                System.out.println(lecture);
            }
        }
    }

    public static void printLecturesBeforeDate(LocalDate date) {
        lectures.sort((l1, l2) -> l1.getDate().compareTo(l2.getDate()));
        for (Lecture lecture : lectures) {
            if (lecture.getDate().isBefore(date.atStartOfDay())) {
                System.out.println(lecture);
            }
        }
    }
    public static void printLecturesInInterval(LocalDate date1, LocalDate date2) {
        lectures.sort((l1, l2) -> l1.getDate().compareTo(l2.getDate()));
        for (Lecture lecture : lectures) {
            if ((lecture.getDate().isAfter(date1.atStartOfDay()))&&(lecture.getDate().isBefore(date1.atStartOfDay()))) {
                System.out.println(lecture);
            }
        }
    }
}

