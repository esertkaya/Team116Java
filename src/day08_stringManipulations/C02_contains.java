package day08_stringManipulations;

public class C02_contains {
    public static void main(String[] args) {

        //Contains metodu bir yazi parcaciginin baska bir yazi icerisinde olup olmadigini
        //kontrol eder. Eger iceriyorsa true,icermiyorsa false cevabini dondurur.

        String str="Java ile her sey cok kolay";

        System.out.println(str.contains("java")); //false
        System.out.println(str.contains("Java")); //true

        String arananKelime="cok";
        System.out.println(str.contains(arananKelime));//false


        String olmayanKelime="deniz";
        System.out.println(str.contains(olmayanKelime));//false bu sekildeki kullanim daha yaygin

        System.out.println(str.contains("a"));//true // harf de aranabilir

        System.out.println(str.contains(" ")); //true bosluk da aratabiliriz.cunku o da bir karakter

        System.out.println(str.contains(""));//true hiclik de true verir.Harfler arasinda hiclik var.
                                            // Java mantigina ters degil
    }
}
