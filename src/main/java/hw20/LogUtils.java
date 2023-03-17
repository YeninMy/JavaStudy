package hw20;

public class LogUtils {
    public static Log[] logs = new Log[50];
    public static int logCounter;
    public static int errCounter;
    public static void add() {
        logs[logCounter] = new Log();
    }

    public static void toColumns() {
        for (int l = 0; l < logs.length; l++) {
            if (logs[l] != null) {
                System.out.println(logs[l]);
            }
        }
    }
}


