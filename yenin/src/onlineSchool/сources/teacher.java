package onlineSchool.сources;

import onlineSchool.servStudent;
import onlineSchool.servTeacher;

public class teacher {
    public String name;

    public static int teacherCounter;

    public static int engTCounter;

    public static int gerTCounter;

    public static int frTCounter;


    String topic;

    public teacher(String name, String topic) {
        servTeacher.teacherId++;
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