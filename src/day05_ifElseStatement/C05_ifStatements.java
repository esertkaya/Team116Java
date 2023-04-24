package day05_ifElseStatement;

import java.util.Scanner;

public class C05_ifStatements {
    public static void main(String[] args) {

        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //ucgen eskenar ise "Eskenar Ucgen" yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen ucgen kenar uzunluklarini sirasiyla giriniz : ");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0) System.out.println(" Eskenar Ucgen ");
    }
}
