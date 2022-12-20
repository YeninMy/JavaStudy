package onlineSchool.сources;

public class cource {
    public int courceId;

    public String name;


    public static int engLecCounter;

    public static int gerLecCounter;

    public static int frLecCounter;

    public static int courceCounter;

    String topic;

    public cource(String name, int courceId, String topic) {
        this.name = name;
        this.courceId = courceId;
        courceCounter++;
        lecture.lecCounter++;
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

