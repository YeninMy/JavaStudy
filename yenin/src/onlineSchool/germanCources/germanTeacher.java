package onlineSchool.germanCources;

import onlineSchool.servTeacher;

public class germanTeacher {
    private static int teacherCounter;

    String name;
    private int id;


    public germanTeacher(String name) {
        servTeacher.teacherId++;
        this.name = name;
        teacherCounter++;
    }

    public static int getTeacherCounter() {
        return germanTeacher.teacherCounter;
    }
}
