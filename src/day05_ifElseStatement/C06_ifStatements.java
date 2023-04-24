package day05_ifElseStatement;

import java.util.Scanner;

public class C06_ifStatements {
    public static void main(String[] args) {

        //Kullanicidan notunu alin.
        //50 veya daha buyukse  Sinifi Gectin
        //50'den kucukse Maalesef Kaldin yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz : ");

        double not = scan.nextDouble();

        if (not >= 50 && not < 100) System.out.println("Sinifi Gectiniz");
        if (not < 50 && not > 0) System.out.println("Maalesef Kaldiniz");








    }
}
