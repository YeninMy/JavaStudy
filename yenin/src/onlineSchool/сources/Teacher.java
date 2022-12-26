package onlineSchool.сources;

import onlineSchool.ServTeacher;

public class Teacher {
    public String name;

    public static int teacherCounter;

    public static int engTCounter;

    public static int gerTCounter;

    public static int frTCounter;


    String topic;

    public Teacher(String name, String topic) {
        ServTeacher.teacherId++;
        this.name = name;
        teacherCounter++;
        this.topic = topic;
        if (topic == "English") {
            engTCounter++;
        } else if (topic == "German") {
            gerTCounter++;
        } else if (topic == "French") {
            frTCounter++;
        }
    }
}