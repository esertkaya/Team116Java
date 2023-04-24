package day05_ifElseStatement;

import java.util.Scanner;

public class C03_ifStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz : ");

        int girilenSayi= scan.nextInt();

        if (girilenSayi%3==0) System.out.println("3 ile bolunebilen sayi");
        if (girilenSayi%5==0) System.out.println("5 ile bolunebilen sayi");
    }
}
