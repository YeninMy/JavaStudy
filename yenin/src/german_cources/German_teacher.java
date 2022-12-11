package german_cources;

public class German_teacher {
    private static int teacherCounter;

    String name;
    private int id;


    public German_teacher(String name, int id) {
        this.name = name;
        this.id = id;
        teacherCounter++;
        }
    public static int getTeacherCounter() {
        return German_teacher.teacherCounter;
    }
    }
