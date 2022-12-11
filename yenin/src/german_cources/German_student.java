package german_cources;

public class German_student {
    private static int studentcounter;

    private String name;
    private int marks;

    private int id;
    private boolean homework_done;

    private static int homework_counter;

    public German_student(String name, int marks, int id, boolean homework_done) {
        this.name = name;
        this.marks = marks;
        this.id = id;
        this.homework_done = homework_done;
        studentcounter++;
        if (homework_done) {
            homework_counter++;
        }
    }

    public static int getStudentCounter() {
        return German_student.studentcounter;
    }

    public static int getHomeworkCounter() {
        return German_student.homework_counter;
    }
}


