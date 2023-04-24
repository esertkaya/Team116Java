package day12_doWhileLoop_Scope;

public class C06_classLevelVariables {
    /*
       Bir class'in tamaminda gecerli variablellar olusturmak istersek
       bu variabllari class level'da olustururuz
       yani class'in icinde ama methodlarin disinda olustururuz.

       Bu variablallrin en ustte olmasi sart degildir.
       Ancak genel kullanimda class level variablellar
       class'in en ust kisminda olusturulur

       Class level variablellar static ve static olmayan (instance)seklinde
       iki farkli sekilde olusturulabilir.

       static variablellar static klubune uye olduklari icin
       tum methodlara gidebilir ve tum methodlarda kullanilabilirler

       instance variablellar static olmadiklari icin
       bu defa karar verici olarak methodlar devreye girer
     */

    static int sayi=10;//Static variable--class level
    String str="Java";//instance variable--class level


    public static void main(String[] args) {

        sayi=20;
        System.out.println(sayi);//20

        //  System.out.println(str);
        // static olmayan bir variable static alandan kullanilamaz

    }

    public static void staticMethod(){
        sayi=30;
        //str="tava";
        //static olmayan bir variable static alanda kullanilamaz



    }

    public void staticOlmayanMethod(){
        sayi=40;
        str="hava";
        //method static degil, variable da static degil



    }
}
