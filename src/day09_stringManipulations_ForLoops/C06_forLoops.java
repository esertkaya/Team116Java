package day09_stringManipulations_ForLoops;

import java.util.Scanner;

public class C06_forLoops {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alin ve bu sayilar arasindaki 3 ile bolunebilen sayilari yazdirin
        //Ilk girilen sayi ikinci girilen sayidan buyuk ise hata mesaji yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen iki pozitif tamsayi girin");
        int sayi= scan.nextInt();
        int sayi2= scan.nextInt();

        if (sayi>sayi2){
            System.out.println("Ilk sayi daha kucuk olmalidir");
        }else{

        }

        for (int i = sayi; i <sayi2; i++) {
            if (i%3==0){
                System.out.println(i + " ");

        }

            {



        }


        }

    }
}
