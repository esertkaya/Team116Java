package day22stringBuilders_AccessModifiers;

public class C03_StringBuildersVeStringMethodlari {

    public static void main(String[] args) {
        /*
          String builderlar'da bazi method'lar String dondurur.
          Bu methodlar String dondurdugu icin
          String'deki immutablity'ye uyarlar
          ve String builder'i degistirmezler

          Bazen de stringBuilder'da olmayan
          ancak String'de olan methodlari kullanmak isteyebiliriz.
          Bu durumda once StringBuilder'i String'e donusturmek gerekir

          Eger String methodlari kullanarak bir StringBuilder'i
          kalici olarak degistirmek istersek
          -once toString() yapip String'e ceviririz
          -String olan bu halinde istedigimiz String methodlari
          */

        StringBuilder sb1=new StringBuilder("Java Candir");
        System.out.println(sb1.substring(5)); //Candir

        System.out.println(sb1);//Java Candir
        sb1.substring(5,8);
        System.out.println(sb1);//Java Candir

        String str="Java";
        System.out.println(sb1.toString().toUpperCase());//JAVA CANDIR

        System.out.println(sb1);//Java Candir

        //bunu yeni bir StringBuilder'a atayabilir miyiz?

      //  sb1=sb1.toString().toUpperCase(); olmuyor
        sb1=new StringBuilder(sb1.toString().toUpperCase());


    }
}
