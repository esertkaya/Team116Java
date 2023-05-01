package day21stringBuilders_AccessModifiers;

public class C06_accessModifierKullanim {

    public static void main(String[] args) {
        System.out.println(C05_accessModifier.defaultStaticSayi);
        C05_accessModifier.defaultStaticMethod();

        //ayni package icinde baska class'taki static olmayan class uyelerinden
        //private olanlar haric tamamina objeile erisebiliriz

        C05_accessModifier obj=new C05_accessModifier();
        System.out.println(obj.defaultStr);
        obj.protectedMethod();

    }
    void baskaClassdanKullanimMethodu(){
        System.out.println(C05_accessModifier.publicStaticSayi);
        C05_accessModifier obj=new C05_accessModifier();
        System.out.println(obj.defaultStr);
        obj.protectedMethod();
    }

}
