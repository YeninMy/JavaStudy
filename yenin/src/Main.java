import onlineSchool.servStudent;
import onlineSchool.servTeacher;
import onlineSchool.сources.cource;
import onlineSchool.сources.lecture;
import onlineSchool.сources.student;
import onlineSchool.сources.teacher;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Онлайн школа:");

        student St1 = new student("Mykhailo", "English", true);
        student St2 = new student("Vadya", "English", true);
        student St3 = new student("Vadya", "English", true);
        student St4 = new student("Tanya", "English", true);
        student St5 = new student("Dron", "English", true);
        student St6 = new student("Sveta", "German", false);
        student St7 = new student("Mykhail", "German", true);
        student St8 = new student("Vadya", "French", true);
        student St9 = new student("Ruslan", "French", true);
        student St10 = new student("Lena", "French", true);

        teacher T1 = new teacher("Dima", "English");
        teacher T2 = new teacher("Kostya", "German");
        teacher T3 = new teacher("Anya", "French");
        teacher T4 = new teacher("Tolya", "French");

        System.out.println("Курси з англійської мови:" + "\nКількість студентів = " + student.engStCounter +
                "\nКількість викладачів = " + teacher.engTCounter);

        System.out.println("Курси з нiмецької мови:" + "\nКількість студентів = " + student.gerStCounter +
                "\nКількість викладачів = " + teacher.gerTCounter);

        System.out.println("Курси з французької мови:" + "\nКількість студентів = " + student.frStCounter +
                "\nКількість викладачів = " + teacher.frTCounter);

        System.out.println("Кiлькість студентів школи = " + servStudent.getStudentCounter());
        System.out.println("Кiлькість викладачів школи = " + servTeacher.getTeacherCounter());

        cource c1 = new cource("cource1", 1, "English");
        lecture lec1 = new lecture(c1.courceId);
        cource c2 = new cource("cource2", 2, "German");
        lecture lec2 = new lecture(c2.courceId);
        cource c3 = new cource("cource3", 3, "French");
        lecture lec3 = new lecture(c3.courceId);
        cource c4 = new cource("cource4", 4, "German");
        lecture lec4 = new lecture(c4.courceId);
        cource c5 = new cource("cource5", 5, "English");
        lecture lec5 = new lecture(c5.courceId);
        cource c6 = new cource("cource6", 6, "English");
        lecture lec6 = new lecture(c6.courceId);
        System.out.println("Усього лекцій проведено= " + lecture.lecCounter);
        System.out.println("Лекцій з англійської мови проведено= " + cource.engLecCounter);
        System.out.println("Лекцій з німецької мови проведено= " + cource.gerLecCounter);
        System.out.println("Лекцій з французької мови проведено= " + cource.frLecCounter);


        if ((student.studentsCounter > 0) && (teacher.teacherCounter > 0) && (lecture.lecCounter > 0)) {
            System.out.println("Натисни 1 щоб додати новий курс:" + "\nНатисни 2 щоб додати нову лекцію:"
                    + "\nНатисни 3 щоб додати нового студента:" + "\nНатисни 4 щоб додати нового вчителя:");
            Scanner scanner1 = new Scanner(System.in);
            final int i1 = scanner1.nextInt();
            switch (i1) {
                case 1:
                    cource c7 = new cource("cource7", 7, "English");
                    System.out.println("id створенного вами крусу =" + c7.courceId);
                    break;
                case 2:
                    lecture l7 = new lecture(7);
                    System.out.println("id створенної вами лекції =" + l7.lecId);
                    break;
                case 3:
                    student St11 = new student("Vadim", "French", false);
                    System.out.println("Імʼя доданого вами студента = " + St11.name);
                    break;
                case 4:
                    teacher T5 = new teacher("Yuriy", "English");
                    System.out.println("Імʼя доданого вами вчителя = " + T5.name);
                    break;
                default:
                    System.out.println("Невірне значення.");
            }
        }

        System.out.println("Щоб додати нову лекцію введіть id нової лекції: ");
        Scanner scanner2 = new Scanner(System.in);
        while (scanner2.hasNext()) {
            final int i2 = scanner2.nextInt();
            final String lecIdFromScanner = scanner2.nextLine();
            lecture lec8 = new lecture(i2);
            System.out.println(lecture.lecCounter);
            if (i2 == 0) {
                break;
            }
        }
    }
}