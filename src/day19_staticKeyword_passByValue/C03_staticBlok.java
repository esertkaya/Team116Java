package day19_staticKeyword_passByValue;

public class C03_staticBlok {

    static{
        System.out.println("En ustteki statik blok calisti");
    }
    public static void main(String[] args) {

        System.out.println("Main Method Calisti");
    }

    static{

        //Static bloklar class calismaya baslar baslamaz devreye girer
        //tum diger kodlardan, hatta main method'dan bile once calisirlar

        //Olur da main method calismadan once ayarlamamiz gereken bazi uyarlamalar varsa
        //veya bazi variable'lara baslangic degerini atamak istiyorsak
        //static bloklar kullanilabilir

        //Birden fazla static blok varsa
        //yukaridan asagi dogru sirali olarak calistirir

        System.out.println("Static blok calisti");

    }
    static{
        System.out.println("Ikinci static blok calisti");
    }
}
