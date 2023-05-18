package day31_iteratorVeCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_SetSoru {

    public static void main(String[] args) {
        //Verilen bir array'den tekrar eden elementleri silip
        //unique elementlerden olusan halini array'e kaydedin

        Integer[]sayilar={2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1};
        // set duplication'a izin vermediginden bir set olusturup tum elemnetleri set'e ekleyelim

        Set<Integer> sayilarSeti=new HashSet<>();

        for (Integer each:sayilar) {
            sayilarSeti.add(each);
        }
        System.out.println(sayilarSeti);

        //array'i bu elementlerle guncelleyelim.

        sayilar=new Integer[sayilarSeti.size()];//[0,0,0,0,0,0,0,0,0]

        int index=0;
        for (Integer each:sayilarSeti) {
            sayilar[index] = each;
            index++;
        }
        System.out.println("Array'in son hali : "+Arrays.toString(sayilar));

        for(int i=1; i<=5; i++) {
            for(int j=(5-i); j>1; j--) {
                System.out.print(i+j);
            }
            System.out.println();
        }


    }
}
