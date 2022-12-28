package onlineSchool;

import onlineSchool.repository.CourceArray;
import onlineSchool.repository.LecArray;
import onlineSchool.сources.Cource;
import onlineSchool.сources.Lecture;

import java.util.Arrays;

public class ServCourceLec {
    public static void allCourceId() {
        System.out.println("Id усіх курсів" + Arrays.toString(CourceArray.courceArray));
    }

    public static void allLecId() {
        System.out.println("Id усіх лекцій" + Arrays.toString(LecArray.lecArray));
    }

    public static void oneCourceThreeLec() {
        for (int c = 0; c < 1; c++) {
            CourceArray.courceArray[c] = new Cource(c);

            for (int l = 0; l < 3; l++) {
                LecArray.lecArray[l] = new Lecture(l);

            }
        }
    }
}