import onlineSchool.ServStudent;
import onlineSchool.ServTeacher;
import onlineSchool.сources.Сource;
import onlineSchool.сources.Lecture;
import onlineSchool.сources.Student;
import onlineSchool.сources.Teacher;

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

        Сource c1 = new Сource("cource1", 1, "English");
        Lecture lec1 = new Lecture(c1.courceId);
        Сource c2 = new Сource("cource2", 2, "German");
        Lecture lec2 = new Lecture(c2.courceId);
//        cource c3 = new cource("cource3", 3, "French");
//        lecture lec3 = new lecture(c3.courceId);
//        cource c4 = new cource("cource4", 4, "German");
//        lecture lec4 = new lecture(c4.courceId);1
//        cource c5 = new cource("cource5", 5, "English");
//        lecture lec5 = new lecture(c5.courceId);
//        cource c6 = new cource("cource6", 6, "English");
//        lecture lec6 = new lecture(c6.courceId);
        System.out.println("Усього лекцій проведено= " + Lecture.lecCounter);
        System.out.println("Лекцій з англійської мови проведено= " + Сource.engLecCounter);
        System.out.println("Лекцій з німецької мови проведено= " + Сource.gerLecCounter);
        System.out.println("Лекцій з французької мови проведено= " + Сource.frLecCounter);


        System.out.println(Lecture.lecCounter);


        if ((Student.studentsCounter > 0) && (Teacher.teacherCounter > 0) && (Lecture.lecCounter > 0)) {
            System.out.println("Натисни 1 щоб додати новий курс:" + "\nНатисни 2 щоб додати нову лекцію:"
                    + "\nНатисни 3 щоб додати нового студента:" + "\nНатисни 4 щоб додати нового вчителя:");
            Scanner scanner1 = new Scanner(System.in);
            final int i1 = scanner1.nextInt();
            switch (i1) {
                case 1:
                    Сource c7 = new Сource("cource7", 7, "English");
                    System.out.println("id створенного вами крусу =" + c7.courceId);
                    break;
                case 2:
                    Lecture l7 = new Lecture(0);
                    System.out.println("id створенної вами лекції =" + l7.lecId);
                    break;
                case 3:
                    Student St11 = new Student("Vadim", "French", false);
                    System.out.println("Імʼя доданого вами студента = " + St11.name);
                    break;
                case 4:
                    Teacher T5 = new Teacher("Yuriy", "English");
                    System.out.println("Імʼя доданого вами вчителя = " + T5.name);
                    break;
                default:
                    System.out.println("Невірне значення.");
            }
        }


        System.out.println("Щоб додати нову лекцію введіть id нової лекції: ");
        Scanner scanner3 = new Scanner(System.in);
        final int i = scanner3.nextInt();
        do {
            final String lecIdFromScanner = scanner3.nextLine();
            Lecture lec = new Lecture(i);
            if (Lecture.lecCounter < 7) {
                System.out.println("Ви успішно створили нову лекцію:" +
                        "\nЗагальна кількість лекцій = " + Lecture.lecCounter +
                        "\nВведіть id щоб додати нову лекцію:");
            }
            if (Lecture.lecCounter == 7) {
                System.out.println("Ви успішно створили нову лекцію:" +
                        "\nЗагальна кількість лекцій = " + Lecture.lecCounter +
                        "\nВведіть id щоб додати останню лекцію на курсі:");
            }
            if (Lecture.lecCounter == 8) {
                System.out.println("Ви не можете створити більше 8-ми лекцій.");
                break;
            }
        } while (i >= 0);
    }
}