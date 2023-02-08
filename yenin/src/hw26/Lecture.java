package hw26;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Lecture {
    private int id;
    private String name;
    private LocalDateTime date;
    private Materials materials;

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

    public Materials getMaterials() {
        return materials;
    }

    public void setMaterials(Materials materials) {
        this.materials = materials;
    }

    public Lecture(int id, String name, LocalDateTime date, Materials materials) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.materials = materials;
    }

    DateTimeFormatter lecFormatter = DateTimeFormatter.ofPattern("yyy MMM d, HH:mm", Locale.ENGLISH);

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + lecFormatter.format(date) +
                ", materials=" + materials +
                '}';
    }
    static List<Lecture> lectures = new ArrayList<>();
    public static void printLectures(){
     for (Lecture lecture : lectures)  {
        System.out.println(lecture);}
    }

    public static void printBy(){
        Comparator  comparator = Comparator.comparing(Lecture::getDate);
        Collections.sort(lectures, comparator);
        System.out.println("----------------------");
        Lecture.printLectures();
    }

}
