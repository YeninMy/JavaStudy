package onlineSchool;

import java.util.Comparator;

public class ComparatorByAdMaType implements Comparator<AdditionalMaterials> {
    @Override
    public int compare(AdditionalMaterials o1, AdditionalMaterials o2) {
        return o1.getResourceType().compareTo(o2.getResourceType());
    }
}