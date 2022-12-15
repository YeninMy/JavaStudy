import onlineSchool.englsihCources.englishStudent;
import onlineSchool.englsihCources.englishTeacher;
import onlineSchool.frenchCources.frenchStudent;
import onlineSchool.frenchCources.frenchTeacher;
import onlineSchool.germanCources.germanStudent;
import onlineSchool.germanCources.germanTeacher;
import onlineSchool.servStudent;
import onlineSchool.servTeacher;
import onlineSchool.lecture;

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

        lecture lec1 = new lecture("lec1", 1, "English");
        lecture lec2 = new lecture("lec2", 2, "German");
        lecture lec3 = new lecture("lec3", 3, "French");
        lecture lec4 = new lecture("lec4", 4, "German");
        lecture lec5 = new lecture("lec5", 5, "English");
        lecture lec6 = new lecture("lec6", 6, "English");
        System.out.println("Усього лекцій проведено= " + lecture.lecCounter);
        System.out.println("Лекцій з англійської мови проведено= " + lecture.engLecCounter);
        System.out.println("Лекцій з німецької мови проведено= " + lecture.gerLecCounter);
        System.out.println("Лекцій з французької мови проведено= " + lecture.frLecCounter);
        System.out.println("ID 6ої лекції= " + lec6.id);

    }

}