package day08_stringManipulations;

import java.util.Scanner;

public class C04_stringManipulationsSoru {
    public static void main(String[] args) {

        //SORU : kullanicidan bir mail alin
        // - mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.

        //1.adim kullanicidan mail almak
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen e-mail adresinizi giriniz");
        String email = scan.next();

        //ikinci adim
        // if (!email.contains("@")){
        //System.out.println("Gecersiz email");
        //}

        //3.adim
        // if (!email.contains("@gmail.com")){
        //System.out.println("mail gmail olmali");
        // }

        //4.adim
        //if (!email.endsWith("gmail.com")){
        //System.out.println("Gecersiz email");
        // }

        // her bir sarti ayri ayri kontrol etmek istiyorsak ayri ayri if yapisi kullanmamiz lazim
        //testlerin kademeli olarak yapilmasini istiyorsak if-if else kullanilabilir

        if (!email.contains("@")){
            System.out.println("Gecersiz email");
        }else if (!email.contains("@gmail.com")){
            System.out.println("mail gmail olmali");
        }else if (!email.endsWith("gmail.com")){
            System.out.println("Gecersiz email");
        }












    }
}
