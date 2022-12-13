package onlineSchool.englsihCources;
import onlineSchool.servTeacher;
public class englishTeacher {
    private static int teacherCounter;

    String name;
    private int id;


    public englishTeacher(String name) {
        servTeacher.teacherId++;
        this.name = name;
        teacherCounter++;
        }
    public static int getTeacherCounter() {
        return englishTeacher.teacherCounter;
    }
    }
