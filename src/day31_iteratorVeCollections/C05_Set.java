package day31_iteratorVeCollections;

import java.util.HashSet;
import java.util.Set;

public class C05_Set {
    public static void main(String[] args) {

        Set<String> sinifList=new HashSet<>();
        sinifList.add("Sahra");
        sinifList.add("Sevda");

        System.out.println(sinifList);

        sinifList.add("Sevda");
        System.out.println(sinifList);
    }
}
