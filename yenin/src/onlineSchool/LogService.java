package onlineSchool;

import java.io.*;
import java.util.Date;

public class LogService {
    static File file = new File("yenin/src/onlineSchool", "logs.txt");

    public static void writeLogs(Object o, Level level) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(file));
             BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            Date date = new Date();
            String message = null;
            LogUtils.add();
            LogUtils.logs[LogUtils.logcounter].setDate(date);
            LogUtils.logs[LogUtils.logcounter].setLevel(level);
            LogUtils.logs[LogUtils.logcounter].setName(o.getClass().getName() + LogUtils.logcounter);
            if (o.getClass() == Person.class) {
                message = "Додано нову персону!";
            } else if (o.getClass() == Lecture.class) {
                message = "Додано нову лекцію!";
            } else if (o.getClass() == Homework.class) {
                message = "Додано нове домашнє завдання!";
            } else if (o.getClass() == AdditionalMaterials.class) {
                message = "Додано нові додаткові матеріали!";
            }
            LogUtils.logs[LogUtils.logcounter].setMessage(message);
            bw.write(date.toString() + "\n");
            bw.write(level + ":" + " " + message + "\n");
            bw.write(o + "\n");
            bw.flush();
            LogUtils.logcounter++;
        } catch (IOException e) {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            String stacktrace = e.getMessage();
            bw.write(stacktrace);
            System.out.println(e.getMessage());

        }
    }

    public static void clearLogs() {
        try {
            FileWriter fl = new FileWriter(file);
            fl.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadLogs() throws IOException, FileNotFoundException  {

            try (Reader reader = new BufferedReader(new FileReader(file));
                 PushbackReader pushbackReader = new PushbackReader(reader)) {

                StringBuilder newText = new StringBuilder();
                boolean inComment = false;

                int ch;
                while ((ch = pushbackReader.read()) != -1) {
                    if (inComment) {
                        if (ch == '\n') {
                            newText.append((char) ch);
                            inComment = false;
                        }
                        continue;
                    } else {
                        if (ch == '-') {
                            int nextChar = pushbackReader.read();
                            if (nextChar == -1 || nextChar != '-') {
                                newText.append((char) ch);
                                pushbackReader.unread(nextChar);
                            } else {
                                inComment = true;
                            }
                        } else {
                            newText.append((char) ch);
                        }
                    }
                }
                System.out.println(newText);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}