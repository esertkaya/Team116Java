package day16_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_kullaniciListeOlusturma {
    public static void main(String[] args) {

        // Kullanicidan alinan isimleri listeye kaydeden bir method olusturun

        System.out.println(kullanicidanStringAlarakListeOlusturma());


    }

    //Method Stringlerden olusan bir List dondurecek
    public static List<String>kullanicidanStringAlarakListeOlusturma(){

        Scanner scan=new Scanner(System.in);

        // Loop sayisi bilinmiyorsa while veya while loop kullanilir
        //Kullanici isim yerine 0 girince program dursun

        String kullaniciGirdisi="";
        List<String>isimler=new ArrayList<>();
        //Kullanici girdisi 0'a esit olmadigi surece loop devam etsin
        while(!kullaniciGirdisi.equalsIgnoreCase("0")) {

            System.out.println("Lutfen listeye eklemek icin bir isim giriniz");
            kullaniciGirdisi = scan.next();

            // Eger kullanici 0 girdiyse listeye ekleme
            if (!kullaniciGirdisi.equalsIgnoreCase("0")) {
                isimler.add(kullaniciGirdisi);

            }
        }



        return isimler;
    }
}
