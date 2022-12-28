package onlineSchool.repository;

import onlineSchool.сources.Cource;
import onlineSchool.сources.Lecture;

import java.util.Arrays;

public class LecArray {
    public static Lecture[] lecArray = new Lecture[18];
    Lecture[] copyOfLecArrays = Arrays.copyOf(lecArray, ((lecArray.length*3)/2)+1);
}
