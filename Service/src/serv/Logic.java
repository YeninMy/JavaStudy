package serv;

import data.Data;
import data.Lecture;

public class Logic {
    public static Lecture getById(int id) {
        Lecture l = null;
        for (Lecture lecture : Data.lectures) {
            if (lecture.getId() == id) {
                l = lecture;
            }
        }
        return l;
    }

}
