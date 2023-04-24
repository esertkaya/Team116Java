package day09_stringManipulations_ForLoops;

import java.util.Scanner;

public class C01_stringManipulations {
    public static void main(String[] args) {

       /* Soru 1 : Kullanicidan bir cumle alin
        - cumlede ev geciyorsa, “home home sweet home” yazdirin
        - cumlede is geciyorsa, “calismak guzeldir”
        - ikisini de iceriyorsa “Hem ev lazim hem is”
        - hicbirini icermiyorsa “cok calisman lazim” yazdirin

        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle girin");
        String cumle= scan.nextLine().toLowerCase();

        //if-else kullanmaliyiz.En kisitlayici olandan baslayalim

        if (cumle.contains("ev") && cumle.contains("is")) {
            System.out.println("Hem ev lazim hem is");
        }else if (cumle.contains("ev")) {
            System.out.println("Home sweet home");
        }else if (cumle.contains("is")) {
            System.out.println("Calismak guzeldir");
        }else{
            System.out.println("Cok calisman lazim");
        }


    }

}
