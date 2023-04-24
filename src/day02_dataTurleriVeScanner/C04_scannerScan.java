package day02_dataTurleriVeScanner;

import java.util.Scanner;

public class C04_scannerScan {
    public static void main(String[] args) {
        // Kullanicidan bir tam sayi isteyin
        // Girilen sayinin iki katini yazdirin

        // 1- Scanner objesi olusturmak

        Scanner scanner=new Scanner(System.in);

        // 2- Kullaniciya ne istediginizi soyleyin

        System.out.println("Lutfen bir tamsayi giriniz: ");

        // 3- Kullanicinin girecegi data turune uygun bir variable olusturun.
        //    Scanner objesi ile variable'a uygun hazir metodu kullanip
        //    kullanicidan degeri alin ve olusturdugumuz variable'a atayin.

        int girilenSayi= scanner.nextInt();
        System.out.println("Girdiginiz sayinin 2 kati: " + 2*girilenSayi);

    }
}
