package day12_doWhileLoop_Scope;

public class Hastane {

   static String hastaneIsmi="Yildiz Hastanesi"; //hastane ismi tum objeler icin gecerli o yuzden static yaptik
    static int personelSayisi;
    String personelIsmi;
    String personelAdresi;
    String personelTelefonu;


   /*
     Class level'da olusuturulan variablelar
     eger tum nesneler icin ortak ise static olarak;
     eger her bir nesne icin farkli olacaksa instance olarak olusturulur

     bu hastanede 500 personel varsa
     500 personel icin
     500 isim, 500 adres, 500 telefon variable'i olmak zorundadir.
     Java bunu su sekilde cozmus:

     bu class'tan bir obje olusturuldugunda
     java tum instance variablellarin bir kopyasini olusturup
     o objeyle ilintilendirir

     Tum class level variablelar icin deger atama mecburiyeti yoktur
     eger deger atanirsa o deger gecerlidir
     ancak eger deger atanmazsa java class level variablellar icin
     default olarak belirledigi degerleri atama yapar.

     sayisal variable:0
     boolean:false
     char:hiclik
     non-primitive:null
    */

    public static void main(String[] args) {

        System.out.println(hastaneIsmi); //Yildiz Hastanesi
        //System.out.println(peresonelIsmi);

        Hastane ayseHemsire=new Hastane();
        System.out.println(ayseHemsire.personelAdresi);
        ayseHemsire.personelAdresi="Cankaya";
        ayseHemsire.personelIsmi="Ayse";
        ayseHemsire.personelTelefonu="123456789";

        Hastane fatmaHemsire=new Hastane();
        fatmaHemsire.personelAdresi="Cankaya";
        fatmaHemsire.personelIsmi="Fatma";
        fatmaHemsire.personelTelefonu="123456789";

        System.out.println(ayseHemsire.personelIsmi);
        System.out.println(fatmaHemsire.personelIsmi);

        //static variablelalra direkt erisim mumkundur
        System.out.println(hastaneIsmi);
        System.out.println(personelSayisi);

        //obje uzerinden de static variablellara ulasilabilir
        //ancak intellij buna gerek yok diye bizi uyarir.

        System.out.println(ayseHemsire.hastaneIsmi);
        //static olan hastaneIsmi variable'ina instance sekilde ulasildi diye uyari verdi

        ayseHemsire.hastaneIsmi="Levent Hastanesi";
        System.out.println(hastaneIsmi);
        System.out.println(fatmaHemsire.hastaneIsmi);




    }
}
