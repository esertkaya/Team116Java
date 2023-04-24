package day11_methodOlverloading_whileLoop;

import java.util.Scanner;

public class C05_whileLoop {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alip 3 ile bolunup bolunemedigini yazdirin
        //Kullanici 3 ile bolunebilen bir sayi girinceye kadar tekrar deger isteyin.

        //Tekrar sayisi tam olarak bilinmeyen,
        //Tekrar sayisi farkli bir sarta bagli olan durumlarda,
        //"while loop" kullaniriz

        Scanner scan=new Scanner(System.in);



        //girilen sayi 3 ile bolunebilene kadar tekrar et
        //while loop'ta icine yazilan sart saglanmadigi muddetce
        //kod tekrar calisir

        int sayi=7;//deger olarak sarti saglayan bir deger olamsi gerekir. yani bu ornekte,sayinin 3 ile bolunememesi gerek

        while (sayi%3 !=0){
            System.out.println("Lutfen pozitif bir tamsayi girin");
            sayi= scan.nextInt();



            if (sayi%3==0){
                System.out.println("Sayi 3 ile tam bolunuyor");
            }else{
                System.out.println("Sayi uc ile tam bolunemiyor");

            }
        }
        }
    }

