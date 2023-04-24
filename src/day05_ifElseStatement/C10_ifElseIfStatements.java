package day05_ifElseStatement;

import java.util.Scanner;

public class C10_ifElseIfStatements {
    public static void main(String[] args) {
        /*
        if     else-if     else-if.... birbirine bagli durum sayisi
        2'den fazla ise kullanilir
        Tum durumlar birbirine bagli oldugundan
        SADECE bir tanesi calisir, otekiler calismaz.
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz : ");

        double not= scan.nextDouble();

        if (not<0 || not>100) {
            System.out.println("Gecersiz not");
        }else if(not>=85) {
            System.out.println("Notunuz AA");
        }else if(not>=65) {
            System.out.println("Notunuz BB");
        }else if(not>=50) {
            System.out.println("Notunuz CC");
        }else{
            System.out.println("Maalesef Kaldiniz");
        }

    }
}
