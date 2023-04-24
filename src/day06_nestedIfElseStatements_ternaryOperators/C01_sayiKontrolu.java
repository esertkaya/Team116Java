package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C01_sayiKontrolu {
    public static void main(String[] args) {

        /*

        Kullanicidan bir sayi girmesini isteyin.
        Sayi asagidaki dort sarti sagliyorsa
        "Mukemmel sayi" yazdirin
        Saglanmayan sartlarin tamamini kullaniciya soyleyin
        1- Sayi 4 basamakli olmalidir
        2- Sayi 3 ile bolunebilmelidir
        3- Sayi 5 ile bolunememelidir
        4- Sayinin birler basamagi tek sayi olmalidir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        boolean sifreBasariliMi = true;
        if (sayi < 1000 || sayi > 9999) {
            System.out.println("Sayi 4 basamakli olmalidir");
            sifreBasariliMi = false;

        }
        if (sayi%3 !=0){
            System.out.println("Sayi 3 ile bolunebilmelidir");
            sifreBasariliMi=false;
        }
        if (sayi%5==0){
            System.out.println("Sayi 5 ile bolunememelidir");
            sifreBasariliMi=false;
        }
        if ((sayi%10)%2==0){
            System.out.println("Sayinin birler basamagi tek sayi olmalidir");
            sifreBasariliMi=false;

        }
        if (sifreBasariliMi){
            System.out.println("Mukemmel sayi");
        }
    }
}