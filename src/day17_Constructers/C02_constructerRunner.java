package day17_Constructers;

public class C02_constructerRunner {
    public static void main(String[] args) {



    //Bu class'tan C01 class'indaki variable ve methodlara ulasmak istiyorum

        //Baska class'taki static class uyelerine ulasmak icin
        System.out.println(C01_Constructers.isHappy);


        //Static olmayan class uyelerine ulasmak icin o class'tan obje olusturmamiz lazim

        C01_Constructers obje=new C01_Constructers();

        //bastaki C01_Costructors==> class adi ve objenin data turudur

        //obje==> objenin adi

        //new==>yeni obje olusturmak icin keyword

        //C01_Constructers() ==> Constructor

        //Bir objenin olusturulmasi ve ilk deger atamasinin (initialize)yapilmasi icin
        //mutlaka Constructor calismalidir.

        //Java bir class olusturuldugunda o class'tan obje olusturulabilmesi icin
        //her class'a otomatik olarak default bir constructor yerlestirir.
        //bu default constructor'lar gorunmez.

        System.out.println(obje.str);
        obje.sayi=20;
        obje.staticOlmayanMethod();
    }
}