package day12_doWhileLoop_Scope;

public class C05_localVariables {
    public static void main(String[] args) {

        //Kural 1-  Local variabllar sadece kendi scopelarinda gecerlidir
        //          Bir method'da olusturulan local variable baska bir method'da kulanilamaz

        //Kural 2-  Local bir scope'ta deger atamadan variable olusturabilirsiniz
        //          ancak deger atamadan local variablellari kullanamazsiniz

        //Kural 3-  Bir loop icerisinde olusturulan variablellar
        //          sadece o loop icerisinde gecerlidir
        //         O loop disinda kullanilamaz. bazi kaynaklarda bunlara "loop variable"'da denir

        int sayi=10;
      // str="Java Candir";

        String slogan="Java candir";
        System.out.println(slogan);
        slogan="Java hayattir";

        String s;

        //System.out.println(s); Deger atanmadigi icin calismaz

        for (int i = 0; i < 10; i++) {
            int sayi2=10;
            System.out.print(sayi2+i);
        }
        //for loop icerisinde i ve sayi2 isminde iki local variable olusturulmustur.
        //loop disinda bunlari kullanalim
        //i=20;
        //System.out.println(i);
        //sayi2=20;
    }

    public static void staticMethod(){
      String str="Java mutluluktur";
       // System.out.println(sayi);
       // System.out.println(yeterMi);
    }

    public void staticOlmayanMethod(){
        boolean yeterMi=true;
      //  System.out.println(sayi);
        //System.out.println(str);
    }

}
