package day07_switchStatements_stringManipulatin;

import java.util.Scanner;

public class ornek_soru_soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen vize notunuzu giriniz");
        double not= scan.nextDouble();

        if (not<0 || not>100){
            System.out.println("Gecersiz not girisi yaptiniz");

        }else if (not<50){
            System.out.println("Maalesef Kaldiniz");
        }else if (not>50){
            System.out.println("Tebrikler Gectiniz");
        }

    }
}
