package day07_switchStatements_stringManipulatin;

public class C06_charAt_length {
    public static void main(String[] args) {

        String str="Java gun gectikce guzellesiyor. Kendisini cok seviyoruz";

        System.out.println(str.charAt(5));
        System.out.println(str.charAt(29));

        //System.out.println(str.charAt(35)); // String index out of bounds exception

        //System.out.println(str.charAt(30));// String index out of bounds exception

        // str'da toplam kac karakter var?

        System.out.println(str.length()); // index sifirdan baslar, length 1'den baslar.
                                         //Java gun gectikce guzellesiyor'un indexi 29 ama length'i 30'dur

        //son harfi yazdirin

        int uzunluk=str.length();
        System.out.println(str.charAt(uzunluk-1));

        // son harften bir onceki harfi yazdirin, sondan ikinci harfi

        System.out.println(str.charAt(uzunluk-2));

        // sondan ucuncu harfi yazdirin
        str.charAt(str.length() -3);

        //*** str.length()-1 cok kullanilir


    }
}
