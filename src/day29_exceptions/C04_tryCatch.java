package day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_tryCatch {
    public static void main(String[] args) {
        //Kullanicidan toplanmak uzere sayi alin
        //Kullanici tamsayi girmezse hata mesaji verip yeniden tamsayi isteyin
        //Kullanici islemi bitirmek icin Q veya q'ya basacaktir
        //Kullanici islemi bitirdiginde kac tane gecerli sayi girdigini
        //ve bu sayilarin toplaminin kac oldugunu yazdirin

        int sayi = 0;
        int toplam = 0;
        int sayac = 0;
        boolean sayiMi = true;
        String tercih = "";
        Scanner scan = new Scanner(System.in);

        while (sayiMi) {

            System.out.print("Bir sayı girin. \nCikis yapmak istiyorsaniz Q veya q basin");
            try {  //normal giris icin calisacak kodlar
                sayi = scan.nextInt();
                toplam += sayi;
                sayac++;
            } catch (InputMismatchException e) { //exception durumunda calisacak kodlar

                tercih = scan.next();//kullanici yanlis giris yaptiginda veya q'a bastiginda burasi calisacak

                if (tercih.equalsIgnoreCase("Q")) {
                    System.out.println("Iyi gunler dileriz");
                    sayiMi = false;
                } else {
                    System.out.println("Toplanmak icin TAMSAYI yazmalisiniz");


                }
            }
        }
        System.out.println("Toplam"+sayac+"adet sayi girdiniz. Toplamlari : "+toplam);
    }
}