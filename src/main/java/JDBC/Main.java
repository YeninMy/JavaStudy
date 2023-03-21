package JDBC;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Lecture lec1 = new Lecture(1, "Arrays", LocalDate.of(2023, 1, 1));
        Lecture lec2 = new Lecture();
        Lecture.copyLecById(lec2,1,2);
        Lecture lec3 = new Lecture(3, "JDBC", LocalDate.of(2023, 2, 2));
        Lecture.delLecture(2);
        Utils.getCount("lectures");
        Utils.getCountPrepared("lectures");
        Utils.printTable("lectures");
        Utils.printTableData("lectures");
    }
}
