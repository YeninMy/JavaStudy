import englsih_cources.English_lectures.English_homework;
import englsih_cources.English_student;
import englsih_cources.English_teacher;
import french_cources.French_student;
import french_cources.French_teacher;
import german_cources.German_student;
import german_cources.German_teacher;

public class Main {
    public static void main(String[] args) {
        System.out.println("Онлайн школа:");

        English_student engSt1 = new English_student("Mykhailo", 4, 1, true);
        English_student engSt2 = new English_student("Ruslan", 5, 2, false);
        English_student engSt3 = new English_student("Vadim", 5, 3, true);
        English_student engSt4 = new English_student("Vasya", 5, 4, true);
        English_student engSt5 = new English_student("Dron", 4, 5, true);
        English_teacher engTe1 = new English_teacher("Dima", 4);

        System.out.println("Курси з англійської мови:" + "\nКількість студентів = " + English_student.getStudentCounter() +
                "\nКількість викладачів =" + English_teacher.getTeacherCounter() +
                "\nКількість студентів що виконали домашнє завдання =" + English_student.getHomeworkCounter());

        German_student gerSt1 = new German_student("Sveta", 5, 5, false);
        German_student gerSt2 = new German_student("Mykhailo", 4, 6, true);
        German_teacher gerTe1 = new German_teacher("Kostya", 7);

        System.out.println("Курси з нiмецької мови:" + "\nКількість студентів = " + German_student.getStudentCounter() +
                "\nКількість викладачів =" + German_teacher.getTeacherCounter() +
                "\nКількість студентів що виконали домашнє завдання =" + German_student.getHomeworkCounter());

        French_student frSt1 = new French_student("Vadya", 4, 8, true);
        French_student frSt2 = new French_student("Ruslan", 5, 9, true);
        French_student frSt3 = new French_student("Lena", 5, 10, true);
        French_teacher frTe1 = new French_teacher("Anya", 11);
        French_teacher frTe2 = new French_teacher("Tolya", 10);

        System.out.println("Курси з французької мови:" + "\nКількість студентів = " + French_student.getStudentCounter() +
                "\nКількість викладачів =" + French_teacher.getTeacherCounter() +
                "\nКількість студентів що виконали домашнє завдання =" + French_student.getHomeworkCounter());



    }

}