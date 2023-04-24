package day09_stringManipulations_ForLoops;

import java.util.Scanner;

public class C02_stringManipulations {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre olusturun");
        String sifre= scan.nextLine();

        //Tum hatalari raporlamam istendigi icin
        //bagimsiz if cumlesi kullanmaliyim
        //tum sartlari saglladigini kontrol etmek icinsayac kullanalim

        int sayac=0;

        char ilkHarf=sifre.charAt(0);
        if (!(ilkHarf>='a' && ilkHarf<='z')){
            System.out.println("Ilk harf kucuk harf olmali");
            sayac++;

        }
        char sonHarf=sifre.charAt(sifre.length()-1);
        if (!(sonHarf>='0' && sonHarf<='9')){
            System.out.println("Son karakter sayi olmali");
            sayac++;
        }

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            sayac++;
        }
        if (sifre.length()<10){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            sayac++;
        }
        if (sayac==0){
            System.out.println("Sifre basariyla kaydedilmistir");
        }
    }
}
