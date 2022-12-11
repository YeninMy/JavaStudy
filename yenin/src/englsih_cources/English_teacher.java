package englsih_cources;

public class English_teacher {
    private static int teacherCounter;

    String name;
    private int id;


    public English_teacher(String name, int id) {
        this.name = name;
        this.id = id;
        teacherCounter++;
        }
    public static int getTeacherCounter() {
        return English_teacher.teacherCounter;
    }
    }
