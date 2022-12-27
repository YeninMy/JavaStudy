package onlineSchool.сources;

public class Cource {
    public int courceId;

    public String name;


    public static int engLecCounter;

    public static int gerLecCounter;

    public static int frLecCounter;

    public static int courceCounter;

    String topic;

    public Cource(String name, int courceId, String topic) {
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

    public Cource(int courceId) {

        this.courceId = courceId;
        courceCounter++;

    }

    @Override
    public String toString() {
        return "Cource{" +
                "courceId='" + courceId + '\'' +
                '}';
    }
}

