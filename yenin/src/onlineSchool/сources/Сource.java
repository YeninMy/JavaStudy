package onlineSchool.сources;

public class Сource {
    public int courceId;

    public String name;


    public static int engLecCounter;

    public static int gerLecCounter;

    public static int frLecCounter;

    public static int courceCounter;

    String topic;

    public Сource(String name, int courceId, String topic) {
        this.name = name;
        this.courceId = courceId;
        courceCounter++;
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

