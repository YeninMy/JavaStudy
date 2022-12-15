import onlineSchool.сources.englsihCources.englishStudent;
import onlineSchool.сources.englsihCources.englishTeacher;
import onlineSchool.сources.frenchCources.frenchStudent;
import onlineSchool.сources.frenchCources.frenchTeacher;
import onlineSchool.сources.germanCources.germanStudent;
import onlineSchool.сources.germanCources.germanTeacher;
import onlineSchool.servStudent;
import onlineSchool.servTeacher;
import onlineSchool.сources.cource;
import onlineSchool.сources.lecture;

public class Main {
    public static void main(String[] args) {
        System.out.println("Онлайн школа:");
        englishStudent engSt1 = new englishStudent("Mykhailo", 4, true);
        englishStudent engSt2 = new englishStudent("Ruslan", 5, false);
        englishStudent engSt3 = new englishStudent("Vadim", 5, true);
        englishStudent engSt4 = new englishStudent("Tanya", 5, true);
        englishStudent engSt5 = new englishStudent("Dron", 4, true);
        englishTeacher engTe1 = new englishTeacher("Dima");

        System.out.println("Курси з англійської мови:" + "\nКількість студентів = " + englishStudent.getStudentCounter() +
                "\nКількість викладачів = " + englishTeacher.getTeacherCounter() +
                "\nКількість студентів що виконали домашнє завдання = " + englishStudent.getHomeworkCounter());

        germanStudent gerSt1 = new germanStudent("Sveta", 5, false);
        germanStudent gerSt2 = new germanStudent("Mykhailo", 4, true);
        germanTeacher gerTe1 = new germanTeacher("Kostya");

        System.out.println("Курси з нiмецької мови:" + "\nКількість студентів = " + germanStudent.getStudentCounter() +
                "\nКількість викладачів = " + germanTeacher.getTeacherCounter() +
                "\nКількість студентів що виконали домашнє завдання = " + germanStudent.getHomeworkCounter());

        frenchStudent frSt1 = new frenchStudent("Vadya", 4, true);
        frenchStudent frSt2 = new frenchStudent("Ruslan", 5, true);
        frenchStudent frSt3 = new frenchStudent("Lena", 5, true);
        frenchTeacher frTe1 = new frenchTeacher("Anya");
        frenchTeacher frTe2 = new frenchTeacher("Tolya");

        System.out.println("Курси з французької мови:" + "\nКількість студентів = " + frenchStudent.getStudentCounter() +
                "\nКількість викладачів = " + frenchTeacher.getTeacherCounter() +
                "\nКількість студентів що виконали домашнє завдання = " + frenchStudent.getHomeworkCounter());

        System.out.println("Кiлькість студентів школи = " + servStudent.getStudentCounter());
        System.out.println("Кiлькість викладачів школи = " + servTeacher.getTeacherCounter());

        cource c1 = new cource("lec1", 1, "English");
        lecture lec1 =new lecture(c1.courceId);
        cource c2 = new cource("lec2", 2, "German");
        lecture lec2 =new lecture(c2.courceId);
        cource c3 = new cource("lec3", 3, "French");
        lecture lec3 =new lecture(c3.courceId);
        cource c4 = new cource("lec4", 4, "German");
        lecture lec4 =new lecture(c4.courceId);
        cource c5 = new cource("lec5", 5, "English");
        lecture lec5 =new lecture(c5.courceId);
        cource c6 = new cource("lec6", 6, "English");
        lecture lec6 =new lecture(c6.courceId);
        System.out.println("Усього лекцій проведено= " + lecture.lecCounter);
        System.out.println("Лекцій з англійської мови проведено= " + cource.engLecCounter);
        System.out.println("Лекцій з німецької мови проведено= " + cource.gerLecCounter);
        System.out.println("Лекцій з французької мови проведено= " + cource.frLecCounter);
        System.out.println("ID 6ої лекції= " + c6.courceId);

    }

}