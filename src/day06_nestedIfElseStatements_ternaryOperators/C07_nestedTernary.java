package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C07_nestedTernary {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        System.out.println( sayi>0
                                 ?
                                 sayi%2==0? "Cift sayi" : "Cift sayi degil"
                                 :
                                 sayi<=999 && sayi<=-100 ? "Uc basamakli" : "Uc basamakli degil"
                                  );
        // sayi>0 ? sayi%2==0 ? "Cift sayi" : "Cift sayi degil" : sayi>= -999 && sayi<= -100 ? "Uc basamakli" : "Uc basamakli degil"



    }
}
