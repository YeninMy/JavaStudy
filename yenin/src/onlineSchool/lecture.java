package onlineSchool;

public class lecture {
    public int id;

    public static int lecCounter;

    public static String name;

    public static int engLecCounter;

    public static int gerLecCounter;

    public static int frLecCounter;

    String topic;

    public lecture(String name, int id, String topic) {
        this.name = name;
        this.id = id;
        lecCounter++;
        this.topic = topic;
        if (topic == "English") {
            engLecCounter++;
        } else if (topic == "German") {
            gerLecCounter++;
        } else if (topic == "French") {
            frLecCounter++;
        }
    }
}