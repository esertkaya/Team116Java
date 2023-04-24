package day05_ifElseStatement;

import java.util.Scanner;

public class C08_ifElseStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz : ");

        char karakter=scan.next().charAt(0);
        if (karakter>='A' && karakter<='Z') {
            System.out.println("Girilen karakter buyuk harf");
        }else{
            System.out.println("Girilen karakter buyuk harf degil");
        }
    }
}
