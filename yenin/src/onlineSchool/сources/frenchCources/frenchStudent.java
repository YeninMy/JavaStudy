package onlineSchool.сources.frenchCources;

import onlineSchool.servStudent;

public class frenchStudent {
    private static int studentCounter;

    private String name;
    private int marks;

    private boolean homework_done;

    private static int homework_counter;

    public frenchStudent(String name, int marks, boolean homework_done) {
        servStudent.studentId++;
        this.name = name;
        this.marks = marks;
        this.homework_done = homework_done;
        studentCounter++;
        if (homework_done) {
            homework_counter++;
        }
    }
    public static int getStudentCounter() {
        return frenchStudent.studentCounter;
    }
    public static int getHomeworkCounter() {
        return frenchStudent.homework_counter;
    }
}


