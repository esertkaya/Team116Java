package day05_ifElseStatement;

import java.util.Scanner;

public class C11_ifElseIfStatements {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin
        //3 ile bolunuyorsa "uc ile bolunebilen sayi",
        //5 ile bolunebiliyorsa "Bes ile bolunebilen sayi"",
        //hem 3, hem 5 ile bolunebiliyorsa "Super" yazdirin

        //Coklu if else bloklari else ile biterse tum durumlari kapsiyor demektir
        //ve her durumda bir if body'si calisir
        //Ancak else ile bitmiyorsa
        //bu durumda bazi degerler icin kodumuz calisir
        //ama hicbir if bodysi calismayabilir

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz : ");

        int girilenSayi= scan.nextInt();
        if (girilenSayi %3==0 && girilenSayi %5==0) {
            System.out.println("SUPER");
        }else if(girilenSayi %5==0) {
            System.out.println("Bes ile bolunebilen sayi");
        }else if(girilenSayi%3==0) {
            System.out.println("Uc ile bolunebilen sayi");

        }
    }
}
