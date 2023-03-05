package hw20;

import java.util.Comparator;

public class ComparatorByAdMaName implements Comparator<AdditionalMaterials> {
    @Override
    public int compare(AdditionalMaterials o1, AdditionalMaterials o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
