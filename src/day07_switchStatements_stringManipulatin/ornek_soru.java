package day07_switchStatements_stringManipulatin;

import java.util.Scanner;

public class ornek_soru {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%3==0) {
            System.out.println("Uc ile bolunebilen sayi");
        }else if (sayi%5==0){
            System.out.println("Bes ile bolunebilen sayi");
        }
    }
}
