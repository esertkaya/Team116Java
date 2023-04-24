package day07_switchStatements_stringManipulatin;

public class C07_containsMethod {
    public static void main(String[] args) {

        String str="Java ogren offer al";

        // str'da a harfi var mi?

        System.out.println(str.contains("a"));
        System.out.println(str.contains("x"));

        // sadece harf mi aratabiliyoruz?

        System.out.println(str.contains("Offer"));// String ifade de kucuk o ile yazildi
        System.out.println(str.contains("offer"));//true

        //char aratabilir miyiz?

        //System.out.println(str.contains('e')); char aratamayiz cunku charSequence lazim.


    }
}
