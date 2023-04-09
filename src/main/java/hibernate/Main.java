package hibernate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LecUtils lecUtils = new LecUtils();

        Lecture lecture1 = new Lecture();
        lecture1.setName("Hibernate");
        lecture1.setDate(LocalDate.of(2022, 9, 14 ));
        lecUtils.saveLecture(lecture1);


        Lecture lecture2 = new Lecture();
        lecture2.setName("Spring");
        lecture2.setDate(LocalDate.of(2022, 10, 9 ));
        lecUtils.saveLecture(lecture2);

        Lecture lecture3 = new Lecture();
        lecture3.setName("Spring");
        lecture3.setDate(LocalDate.of(2022, 11, 8 ));
        lecUtils.saveLecture(lecture3);

        System.out.println(lecUtils.getLecture(1));
        lecUtils.deleteLecture(2);
        lecUtils.getAllLectures().stream().forEach(System.out::println);
    }
}
