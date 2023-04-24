package day11_methodOlverloading_whileLoop;

import java.util.Scanner;

public class ldk {
    public static void main(String[] args) {

        //- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        //Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //isim bosluk soyisim seklinde bize donduren bir method olusturun
        //input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz

        Scanner scan=new Scanner(System.in);
        System.out.println("isim : ");
        String isim=scan.nextLine();
        System.out.println("soyisim : ");
        String soyisim= scan.nextLine();

        isimSoyisim(isim,soyisim);


    }

    public static void isimSoyisim(String isim,String soyisim){

      isim.toUpperCase().charAt(0);
      soyisim.toUpperCase().charAt(0);
        System.out.println(isim+ " " +soyisim);
    }
}
