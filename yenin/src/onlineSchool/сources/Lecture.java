package onlineSchool.сources;

public class Lecture {

    public int lecId;

    public static int lecCounter;

    public Lecture(int lecId) {
        this.lecId = lecId;
        lecCounter++;
    }

    @Override
    public String toString() {
        return "Lecture{" + "lecId=" + lecId + '\'' + '}';
    }

}
