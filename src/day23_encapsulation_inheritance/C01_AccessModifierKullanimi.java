package day23_encapsulation_inheritance;

import day22stringBuilders_AccessModifiers.C05_accessModifier;

public class C01_AccessModifierKullanimi extends C05_accessModifier {
    public static void main(String[] args) {

        //baska package'daki bir class'dan class uyelerinin
        //sadece publ;ic olanlari kullanabiliriz
        //eger bulundugumuz class ile ulasmak istedigimiz class arasinda
        //parent-child iliskisi varsa class uyelerine erisim mumkundur

        System.out.println(C05_accessModifier.publicStaticSayi);
        C05_accessModifier.publicStaticMethod();

        C05_accessModifier.protectedStaticSayi=10;
        C05_accessModifier.publicStaticSayi=25;

        System.out.println(C05_accessModifier.publicStaticSayi);
        System.out.println(C05_accessModifier.protectedStaticSayi);

        /*
          Access modifier ile erisimi duzenlenen bir class uyesine baska class'dan
          erisebilirsek hem deger atamasi yapabilir hem de o class uyesinin degerini yazdirabiliriz.
         */



        //1-ccess modifier: Bir class uyesine (class level variables,methods,constructors) hangi classlardan
        // erisilebilecegini belirler.
        //2--Onemli Not: Bir class uyesine erisim yetkisi/yontemi icin sadece access modifier yeterli olmaz,
        //class uyesinin static olup olmadigina da bakmak gerekir
        //3-Dort access modifier vardir. Dardan genise dogru yazarsak;
            //*private: Sadece ve sadece icinde bulundugu class'dan erisilebilir
            //*default access modifier: Icinde bulunulan class ve icinde bulunulan package'daki diger classlardan
            //erisilebilir.Default access modifier yazi ile yazilmaz. Bir class uyesinin onunde gorunur bir access
            //modifier yoksa access mpdifier'i default'tur deriz
            //*protected: Icinde bulunulan clas, icinde bulunulan package'daki diger class'lar,
            //baska package'lar altindaki child class'lar.
            //*public: Tum class'lardan erisilir
    }
}
