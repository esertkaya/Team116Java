package day19_staticKeyword_passByValue;

public class C04_staticOlmayanBlok {
    public static void main(String[] args) {
        System.out.println("main method calisti");
        C04_staticOlmayanBlok obj1=new C04_staticOlmayanBlok();
        C04_staticOlmayanBlok obj2=new C04_staticOlmayanBlok();
        C04_staticOlmayanBlok obj3=new C04_staticOlmayanBlok();

    }

    static{
        System.out.println("static blok calisti");
    }
    {
        //static olmayan kod blogu

        //static olmayan kopd bloklari objelere baglidir
        //her obje olusturuldugunda static olmayan blok tekrar calisir
        //static blok ise sadece bir kere, class ilk calismaya basladiginda calisir

        //obje olusturuldugunda constructor icinde yapmak istemediginiz
        //ama obje icin ihtiyac duydugunuz bir islem varsa
        //static olmayan blok kullanilabilir

        System.out.println("Static olmayan kod blogu calisti");
    }
}
