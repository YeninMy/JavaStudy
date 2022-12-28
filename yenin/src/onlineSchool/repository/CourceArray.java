package onlineSchool.repository;

import onlineSchool.сources.Cource;

import java.util.Arrays;

public class CourceArray {
    public static Cource[] courceArray = new Cource[6];
   Cource[] copyOfCourceArrays = Arrays.copyOf(courceArray, ((courceArray.length*3)/2)+1);
}
