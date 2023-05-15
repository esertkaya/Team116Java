package day29_exceptions;

import java.util.Scanner;

public class C01_Exceptions {
    public static void main(String[] args) {


        //Kullanicidan iki tam sayi alip ilk sayiyi ikinciye bolun
        //ve sonucun tams sayi kismini yazin

        /*
          Kodlarimizi yazarken kullanici tarafindan yapilabilecek hatalari ONGOREBILIYORSAK
          java'ya ongorebildigimiz hata ihtimalleri icin yapmasi gerekenleri soyleyebiliriz
          ornegin; asagidaki bolme isleminde kullanicinin sifir girme ihtimalini if else ile handle edebiliriz
          Ancak tum sorunlari if else ile cozmek mumkun degildir
          ornegin istenen data turune uygun olmayan input girilmesini if else ile cozemeyiz
          Java ongorulebilir hatalari cozebilmemiz icin
          exception interface'ini olusturmustur
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bolunecek tamsyi yazin");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen bolunecek tam sayi yazin");
        int sayi2 = scan.nextInt();

        if (sayi2 == 0) {
            System.out.println("Sayilar sifira bolunemez");

        }else{
            System.out.println("Iki sayinin bolme sonucu: "+sayi1/sayi2);
        }

    }
}
