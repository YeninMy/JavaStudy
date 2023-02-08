package hw26;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Lecture.lectures.add(new Lecture(1, "Enum",
                LocalDateTime.of(2023, 1, 5, 12, 0),
                new Material(1, Type.URL)));
        Lecture.lectures.add(new Lecture(2, "Interface",
                LocalDateTime.of(1995, 5, 15, 12, 0),
                new Material(3, Type.VIDEO)));
        Lecture.lectures.add(new Lecture(3, "Map",
                LocalDateTime.of(2000, 1, 1, 12, 0),
                new Material(2, Type.BOOK)));
        Lecture.lectures.add(new Lecture(4, "Date",
                LocalDateTime.of(2020, 4, 11, 12, 0),
                new Material(5, Type.URL)));
        Lecture.lectures.add(new Lecture(5, "Classes",
                LocalDateTime.of(1995, 5, 5, 12, 0),
                new Material(4, Type.URL)));

        for (Lecture l : Lecture.lectures) {
            Material.materials.add(l.getMaterials());
        }

        System.out.println("Lectures sort by Id:");
        Lecture.printLecturesById();
        System.out.println("----------------------");
        System.out.println("Lectures sort by date:");
        Lecture.printLecturesByDate();
        System.out.println("----------------------");
        System.out.println("Materials sort by Id:");
        Material.printMaterialsById();
        System.out.println("----------------------");
        System.out.println("Materials sort by Date:");
        Material.printMaterialsByLectures();
        System.out.println("----------------------");

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
        Lecture.printLecturesFromDate(LocalDate.parse("22-11-2000", dateFormatter));
        System.out.println("----------------------");
        Lecture.printLecturesBeforeDate(LocalDate.parse("22-11-2000", dateFormatter));
        System.out.println("----------------------");
        Lecture.printLecturesInInterval(LocalDate.parse("01-01-2000", dateFormatter),LocalDate.parse("22-11-2021", dateFormatter));
    }
}