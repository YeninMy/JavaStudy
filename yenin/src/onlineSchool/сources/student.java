package onlineSchool.сources;

import onlineSchool.servStudent;

public class student {
    public String name;
    private boolean homeworkDone;

    public static int studentsCounter;

    public static int engStCounter;

    public static int gerStCounter;

    public static int frStCounter;


    private static int homeworkCounter;

    String topic;

    public student(String name, String topic, boolean homeworkDone) {
        servStudent.studentId++;
        this.name = name;
        this.homeworkDone = homeworkDone;
        studentsCounter++;
        if (homeworkDone) {
            homeworkCounter++;
        }
        this.topic = topic;
        if (topic == "English") {
            engStCounter++;
        } else if (topic == "German") {
            gerStCounter++;
        } else if (topic == "French") {
            frStCounter++;
        }

    }
}
