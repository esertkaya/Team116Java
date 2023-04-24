package day07_switchStatements_stringManipulatin;

import java.util.Locale;

public class C05_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Java Candir.";
        //System.out.println("Tumunu buyuk harf olarak yazdirin");
        System.out.println(str.toUpperCase());

        System.out.println(str);

        str=str.toUpperCase();
        System.out.println(str);
        System.out.println(str.toLowerCase());
        //turkce karakterleri dikkate alin

        str=str.toLowerCase(Locale.forLanguageTag("Tr"));

        String str2="Kimse beni aramiyor";
        // Turkce karakterlere uygun olarak buyuk haliyle yazdirin

        System.out.println(str2.toUpperCase(Locale.forLanguageTag("Tr")));


    }
}
