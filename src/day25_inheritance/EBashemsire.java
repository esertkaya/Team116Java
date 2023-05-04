package day25_inheritance;

public class EBashemsire extends DHemsire {
    EBashemsire(){
        System.out.println(adres);
        adres="Cankaya";
        System.out.println(gorev);
        System.out.println("Genel Gorev : "+super.gorev);//super yazinca parent class'daki degere bakiyor
                                                         //this ile yazsaydik bu class'dakine bakacakti
        isim="Ayse";
        System.out.println(this.isim);
        System.out.println(super.isim);
        this.maas();
        super.maas();
        nobet();
        this.nobet();
        super.nobet();

        ozelSigorta();
        this.ozelSigorta();
        super.ozelSigorta();

        tazminat();
        this.tazminat();
        //super.tazminat  CTE
        //Inheritance'da child'da yoksa parent'a bakilir
        //Ama parent'da yoksa child'a bakilmaz, CTE olur
    }


    String gorev="Bas Hemsire";
    String adres="Adres Belirtilmedi";

    public void maas(){
        System.out.println("Bas Hemsire maasi : "+3000);
    }
    public void nobet(){
        System.out.println("Bashemsireler 3 gun nobet tutar");
    }
    public void tazminat(){
        System.out.println("Bashemsireler 13.maasi alir");
    }

    public static void main(String[] args) {
        EBashemsire bh1=new EBashemsire();
       /* System.out.println(bh1.adres);//Adres Belirtilmedi
        bh1.adres="Cankaya";
        System.out.println(bh1.isim);//Atanmadi
        bh1.isim="Ayse";
        System.out.println(bh1.isim);//Ayse
        */
        System.out.println(bh1.adres);


    }
}
