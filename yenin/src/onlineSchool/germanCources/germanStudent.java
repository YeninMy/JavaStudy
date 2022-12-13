package onlineSchool.germanCources;

import onlineSchool.servStudent;

public class germanStudent {
    private static int studentcounter;

    private String name;
    private int marks;

    private boolean homework_done;

    private static int homework_counter;

    public germanStudent(String name, int marks, boolean homework_done) {
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
        return germanStudent.studentcounter;
    }

    public static int getHomeworkCounter() {
        return germanStudent.homework_counter;
    }
}


