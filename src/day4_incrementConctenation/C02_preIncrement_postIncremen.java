package day4_incrementConctenation;

import java.util.Scanner;
public class C02_preIncrement_postIncremen {
    public static void main(String[] args) {
        //kullanicidan bir tam sayi isteyin
        //girilen sayiyi yazdirip bir artirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz: ");

        int girilenSayi= scan.nextInt();

        System.out.println("Girilen Sayi: " +girilenSayi++);

        System.out.println("Lutfen bir tamsayi daha giriniz: ");
        int sayi= scan.nextInt();

        System.out.println("Girilen Sayi2: " +    ++sayi);
        System.out.println("Kodun Sonunda GS: " +girilenSayi+ "GS: " +sayi);
    }
}
