package onlineSchool.сources.englsihCources;

import onlineSchool.servStudent;

public class englishStudent {
    private static int studentcounter;

    private String name;
    private int marks;

    private boolean homework_done;

    private static int homework_counter;

    public englishStudent(String name, int marks, boolean homework_done) {
        servStudent.studentId++;
        this.name = name;
        this.marks = marks;
        this.homework_done = homework_done;
        studentcounter++;
        if (homework_done) {
            homework_counter++;
        }
    }

    public static int getStudentCounter() {
        return englishStudent.studentcounter;
    }

    public static int getHomeworkCounter() {
        return englishStudent.homework_counter;
    }
}


