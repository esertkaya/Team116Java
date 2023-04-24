package day02_dataTurleriVeScanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini, yasini alip asagidaki formatta yazdirin
        // Isminiz: John
        // Soyisminiz: Doe
        // Yasiniz: 44
        // Kaydiniz basariyla tamamlanmistir

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen sirasiyla isminiz, soyisminizi ve yasinizi giriniz: ");
        String isim= scan.nextLine();
        String soyisim= scan.nextLine().toUpperCase();
        int yas= scan.nextInt();
        System.out.println("Isminiz: " +isim+ "\nSoyisminiz: " +soyisim+ "\nYasiniz: " +yas+
                           "\nKaydiniz basariyla tamamlanmistir");






    }
}
