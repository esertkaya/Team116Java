package day09_stringManipulations_ForLoops;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class C03_stringManipulations {

    public static void main(String[] args) {
        //Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim=scan.nextLine();

        if (isim.length()> soyIsim.length()){
            isim=isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase();
            soyIsim=soyIsim.toUpperCase().charAt(0)+soyIsim.substring(1).toLowerCase();

        }else{
            isim=isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase();
            soyIsim=soyIsim.toUpperCase();
        }
        System.out.println(isim + " " + soyIsim);
    }
}
