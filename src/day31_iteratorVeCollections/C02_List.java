package day31_iteratorVeCollections;

import java.util.LinkedList;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {

        List<String> liste=new LinkedList<>();
        liste.add("Esat");
        liste.add("Sevda");
        liste.add("Ilknur");
        liste.add("Seyma");
        System.out.println(liste); //[Esat, Sevda, Ilknur, Seyma]

        liste.add(2,"Nurhayat");

        System.out.println(liste);//[Esat, Sevda, Nurhayat, Ilknur, Seyma]

        List<String> liste2=new LinkedList<>();
        liste2.add("Yusuf");
        liste2.add("Esat");
        liste2.add("Ilknur");
        liste2.add("Murat");
        System.out.println(liste2);
        System.out.println(liste.retainAll(liste2));//true

        System.out.println("Liste son hali : "+ liste);//[Esat, Ilknur]

        //Ortak elemanlar kalir, digerlerini siler






    }
}
