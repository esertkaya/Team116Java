package day25_inheritance;

import day24_inheritance.FCorolla;

public class Corolla extends BToyota {
    Corolla() {
        System.out.println("Corolla constructor calistir");
    }
    Corolla(int sayi) {}
    Corolla(String yakit) {
        super(5);

            System.out.println("String parametreli constructor calisti");

            System.out.println("Corolla int parametreli constructor calisti");
        }

    String uretimYeri = "Turkiye";
    String model = "Corolla";

    public static void main(String[] args) {

       // Corolla corolla = new Corolla(5);
        Corolla corolla2=new Corolla("Elektrik");
    }
}