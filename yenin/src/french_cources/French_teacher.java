package french_cources;

public class French_teacher {
    private static int teacherCounter;

    String name;
    private int id;


    public French_teacher(String name, int id) {
        this.name = name;
        this.id = id;
        teacherCounter++;
        }
    public static int getTeacherCounter() {
        return French_teacher.teacherCounter;
    }
    }
