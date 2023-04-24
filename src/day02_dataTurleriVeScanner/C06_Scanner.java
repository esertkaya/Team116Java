package day02_dataTurleriVeScanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // Kullanicidan bir double bir de int sayi alip
        // bunlarin toplamini ve carpimini yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen ondalikli bir sayi giriniz: ");
        double ondSayi= scan.nextDouble();

        System.out.println("Lutfen bir tam sayi giriniz: ");
        int tamSayi= scan.nextInt();

        System.out.println("Girilen sayilarin toplami: "+(ondSayi+tamSayi));
        System.out.println("Girilen sayilarin carpimi: "+ondSayi*tamSayi);

    }
}
