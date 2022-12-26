package onlineSchool.сources;

import onlineSchool.ServStudent;

public class Student {
    public String name;
    private boolean homeworkDone;

    public static int studentsCounter;

    public static int engStCounter;

    public static int gerStCounter;

    public static int frStCounter;


    private static int homeworkCounter;

    String topic;

    public Student(String name, String topic, boolean homeworkDone) {
        ServStudent.studentId++;
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
