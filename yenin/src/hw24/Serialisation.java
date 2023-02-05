package hw24;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialisation {
    public static void serialiseCource(List<Course> courses) {
        File file = new File("yenin/src/hw24/serializedCourses.txt");
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            for (Course course : courses) {
                out.writeObject(course);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deserialiseCource(List<Course> courses) {
        List<Course> deserialisedCourseList = new ArrayList<>();
        Course deserialisedCource;
        File file = new File("yenin/src/hw24/serializedCourses.txt");
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            for (Course course : courses) {
                out.writeObject(course);
            }
            for (Course ignored : courses) {
                deserialisedCource = (Course) in.readObject();
                deserialisedCourseList.add(deserialisedCource);
            }
            for (Course dcourse : deserialisedCourseList) {
                dcourse.printCource();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
