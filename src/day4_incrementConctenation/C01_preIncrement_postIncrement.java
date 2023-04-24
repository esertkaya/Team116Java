package day4_incrementConctenation;

import java.util.Scanner;

public class C01_preIncrement_postIncrement {

    public static void main(String[] args) {

        //kullanicidan bir tam sayi isteyin
        //girilen sayiyi yazdirip bir artirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz: ");

        int girilenSayi= scan.nextInt();

        System.out.println("Girilen Sayi: " +girilenSayi);

        girilenSayi++;

        //Kullanicidan bir sayi daha alin
        //bu sayiyi once artirin, sonra yazdirin

        System.out.println("Lutfen bir tamsayi daha giriniz: ");
        int sayi= scan.nextInt();
        sayi++;
        System.out.println("Girilen Sayi: " +sayi);

        System.out.println("Kodun sonunda: " + girilenSayi + "GS2 : " +sayi);

    }
}
