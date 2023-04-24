package day17_Constructers;

public class C04_hastaneRunner {

    public static void main(String[] args) {
        /*
        // Biz bir obje olusturdugumuzda java once bu constructor un varligini teyit eder.
           Constructor Varsa istene objeyi olusturur.
           Obje olusturulunca instance olan butun variable larin birer kopyalarini olusturur
           ve bu objeye iliskilendirir
           Objeye yeni bir atama yapmadigimiz muddetce
           objenin olusturuldugu class'taki ilk degerleri kullanir

           Obje uzerinden static variablellara ulasmak istedigimizde java once objeye gider
           O objeye ilisiklendirilen bilgilerde istenen variable'i bulamazsa
           class seviyesinde static variable'lara ulasir

           Static variable''lar class'a baglidir
           ve degistirilirse tum objeler icin degisikli gecerli olur
         */

        C03_Hastane personel1=new C03_Hastane();


        System.out.println(personel1.personelIsmi);
        personel1.personelTuru="Doktor";
        System.out.println(personel1.maas("Doktor"));



        C03_Hastane personel2=new C03_Hastane();
        System.out.println(personel2.personelTuru);
        System.out.println(personel2.maas("Hemsire"));

        System.out.println(personel1.hastaneAdi);

        personel2.hastaneAdi="Java Hastanesi";
        System.out.println(personel1.hastaneAdi);//Java Hastanesi

    }
}
