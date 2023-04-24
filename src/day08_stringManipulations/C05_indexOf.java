package day08_stringManipulations;

public class C05_indexOf {
    public static void main(String[] args) {
        //indexOf metodu aranan yazi parcasinin yazi icindeki index'ini
        //bize cevap olarak dondurur.


        String str = "Java en iyisi";

        System.out.println(str.indexOf("e"));//5

        System.out.println(str.indexOf("a"));//1 Java soldan bakmaya baslar. ilk gordugu indexi alir

        System.out.println(str.indexOf("en"));//5 //Bu java icin 2 harf degil tugla gibidir,tektir ve baslangic indexini alir
        System.out.println(str.indexOf("yi"));//9 ikici indexi degil ilk indexi alir

        System.out.println(str.indexOf("iyisi"));//8 ilk indexi alir. butun kelimeyi tek bir index olarak alir

        System.out.println(str.indexOf("is"));//10
        System.out.println(str.indexOf("iy"));//8

        System.out.println(str.indexOf("o"));// olmayan ifadeler icin -1 doner
        System.out.println(str.indexOf("en guzeli"));// -1//

        System.out.println(str.indexOf("a", 1));//1
        System.out.println(str.indexOf("a", 2));//3
        System.out.println(str.indexOf("i", 5));//8
        System.out.println(str.indexOf("i", 9));//10
        System.out.println(str.indexOf("i", 11));//12


        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 2 kere veya daha fazla kullanilmis

        //Java en iyisi icerisinde "en" kelimesi icin

        if (str.indexOf("en") == -1) {
            System.out.println("Aradiginiz kelimeyi cumel icermiyor");

        } else {
            int birinciKelimeIndex = str.indexOf("en");
            if (str.indexOf("en", birinciKelimeIndex + 1) == -1) {
                System.out.println("Bu cumlede aradiginiz kelime bir adet var");

            } else {
                System.out.println("Bu cumlede aeadiginiz kelime birden cok adet var");
            }


        }

    }
}