package hibernate;

import java.time.LocalDate;

import static hibernate.DBUtils.DBUtils.saveEntity;
import static hibernate.DBUtils.LecUtils.getAllLectures;
import static hibernate.DBUtils.StUtils.getAllStudents;

public class Main {
    public static void main(String[] args) {
        Cource cource1 = new Cource();
        cource1.setName("Java");

        Teacher teacher1 = new Teacher();
        teacher1.setName("Vadya");
        teacher1.setLastname("Bedrytskiy");

        saveEntity(teacher1);

        Homework hw1 = new Homework();
        hw1.setTask("do something");

        Homework hw2 = new Homework();
        hw2.setTask("do something better");

        Homework hw3 = new Homework();
        hw3.setTask("do something cool");

        Lecture lecture1 = new Lecture();
        lecture1.setName("Hibernate");
        lecture1.setDate(LocalDate.of(2022, 9, 14));
        lecture1.setTeacher(teacher1);

        Lecture lecture2 = new Lecture();
        lecture2.setName("Spring");
        lecture2.setDate(LocalDate.of(2022, 10, 9));
        lecture2.setTeacher(teacher1);

        Lecture lecture3 = new Lecture();
        lecture3.setName("Web");
        lecture3.setDate(LocalDate.of(2022, 11, 8));
        lecture3.setTeacher(teacher1);

        Student student1 = new Student();
        student1.setName("Sveta");
        student1.setLastname("Zhu");

        Student student2 = new Student();
        student2.setName("Russel");
        student2.setLastname("Chailo");

        Student student3 = new Student();
        student3.setName("Dima");
        student3.setLastname("Prikol");



        lecture1.addHomework(hw1);
        lecture2.addHomework(hw3);
        lecture1.addHomework(hw2);

        student1.addLecture(lecture1);
        student1.addLecture(lecture2);

        student2.addLecture(lecture1);

        student3.addLecture(lecture1);
        student3.addLecture(lecture2);
        student3.addLecture(lecture3);

        // Сохранение сущностей после установки связей
        cource1.addLecture(lecture1);
        cource1.addLecture(lecture2);
        cource1.addLecture(lecture3);

//        saveEntity(lecture1);
//        saveEntity(lecture2);
//        saveEntity(lecture3);
        saveEntity(cource1);
        saveEntity(student1);
        saveEntity(student2);
        saveEntity(student3);

        getAllStudents().forEach(System.out::println);
        getAllLectures().forEach(System.out::println);
    }
}

