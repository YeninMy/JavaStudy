import onlineSchool.ServCourceLec;
import onlineSchool.ServStudent;
import onlineSchool.ServTeacher;
import onlineSchool.сources.Lecture;
import onlineSchool.сources.Student;
import onlineSchool.сources.Teacher;
import onlineSchool.сources.Cource;
import onlineSchool.repository.CourceArray;
import onlineSchool.repository.LecArray;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Онлайн школа:");

        Student St1 = new Student("Mykhailo", "English", true);
        Student St2 = new Student("Vadya", "English", true);
        Student St3 = new Student("Vadya", "English", true);
        Student St4 = new Student("Tanya", "English", true);
        Student St5 = new Student("Dron", "English", true);
        Student St6 = new Student("Sveta", "German", false);
        Student St7 = new Student("Mykhail", "German", true);
        Student St8 = new Student("Vadya", "French", true);
        Student St9 = new Student("Ruslan", "French", true);
        Student St10 = new Student("Lena", "French", true);

        Teacher T1 = new Teacher("Dima", "English");
        Teacher T2 = new Teacher("Kostya", "German");
        Teacher T3 = new Teacher("Anya", "French");
        Teacher T4 = new Teacher("Tolya", "French");

        System.out.println("Курси з англійської мови:" + "\nКількість студентів = " + Student.engStCounter +
                "\nКількість викладачів = " + Teacher.engTCounter);

        System.out.println("Курси з нiмецької мови:" + "\nКількість студентів = " + Student.gerStCounter +
                "\nКількість викладачів = " + Teacher.gerTCounter);

        System.out.println("Курси з французької мови:" + "\nКількість студентів = " + Student.frStCounter +
                "\nКількість викладачів = " + Teacher.frTCounter);

        System.out.println("Кiлькість студентів школи = " + ServStudent.getStudentCounter());
        System.out.println("Кiлькість викладачів школи = " + ServTeacher.getTeacherCounter());

        //Cource c1 = new Cource("cource1", 1, "English");
        //  Lecture lec1 = new Lecture(c1.courceId);
//        Сource c2 = new Сource("cource2", 2, "German");
//        Lecture lec2 = new Lecture(c2.courceId);
//        Сource c3 = new Сource("cource2", 2, "German");
//        Lecture lec3 = new Lecture(c3.courceId);

        System.out.println("Усього лекцій проведено= " + Lecture.lecCounter);
        System.out.println("Лекцій з англійської мови проведено= " + Cource.engLecCounter);
        System.out.println("Лекцій з німецької мови проведено= " + Cource.gerLecCounter);
        System.out.println("Лекцій з французької мови проведено= " + Cource.frLecCounter);


        ServCourceLec.oneCourceThreeLec();


        System.out.println("Натисныть '1' Щоб вывести на экран id усіх курсів та лекцій:");
        Scanner scanner2 = new Scanner(System.in);
        int q = scanner2.nextInt();
        if (q == 1) {
            ServCourceLec.allCourceId();
            ServCourceLec.allLecId();
        }
    }
}
