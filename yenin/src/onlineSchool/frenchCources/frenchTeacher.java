package onlineSchool.frenchCources;

import onlineSchool.servTeacher;

public class frenchTeacher {
    private static int teacherCounter;

    String name;


    public frenchTeacher(String name) {
        servTeacher.teacherId++;
        this.name = name;
        teacherCounter++;
        }
    public static int getTeacherCounter() {
        return frenchTeacher.teacherCounter;
    }
    }
