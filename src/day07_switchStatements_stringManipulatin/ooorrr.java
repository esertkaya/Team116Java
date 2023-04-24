package day07_switchStatements_stringManipulatin;

import java.util.Scanner;

public class ooorrr {
    public static void main(String[] args) {
        //Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int tamSayi = scan.nextInt();

        if (tamSayi % 5 == 0) {
            System.out.println("Sayi 5'in tam kati");

        }
    }
}