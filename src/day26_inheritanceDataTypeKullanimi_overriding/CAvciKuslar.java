package day26_inheritanceDataTypeKullanimi_overriding;

public class CAvciKuslar extends BKuslar{
    String hareket= "ucarlar";
    String beslenme= "et yerler";
    String pence= "pencelidir";
    String gaga= "sivri gagali";

    public static void main(String[] args) {
        /*
          Asagidaki 3 obje de ayni constructor kullanmistir
          yani 3'u de avci kustur
          Ama data turu farkli secildigi icin
          ozellikleri farkli olur

          Bir obje olusturulurken
         *eger cosntructor ve data turu ayni ise
          o class'a gidilir
          aranan ozellik varsa kullanilir
          yoksa parent class'lara da bakilir
          ilk bulunan variable gecerli olur

         *cons ve data turu farkli ise
         obje olusturulursa da ozelliklerin data turu olan
         class'daki gibi olmasini isteriz
         bir VARIABLE'in degerini aramaya data turu
         olan class'dan baslanir

         Bir obje olusturulurken data turu consttructor'dan farkli ise
         tum variable'lari Data Turu olan class'a gore dusunmeliyiz.

         */

        CAvciKuslar avci1=new CAvciKuslar();
        System.out.println(avci1.beslenme);//et yerler
        System.out.println(avci1.pence);//pencelidir
        System.out.println(avci1.hareket);//ucarlar
        System.out.println(avci1.gaga);//sivri gagali
        System.out.println(avci1.kanat);//kanatlidirlar
        System.out.println(avci1.cogalma);//yumurtayla cogalirlar
        System.out.println(avci1.solunum);//akcigerle nefes alirlar
        System.out.println(avci1.omur);//yasar ve olurler


        BKuslar avciKusgiller=new CAvciKuslar();//avciKuslar is a kuslar diyebiliyoruz
        System.out.println(avciKusgiller.beslenme);//AHayvan class'ina gider // beslenirler
        //System.out.println(avciKusgiller.pence);//CTE verir. AHayvan veya BKuslar class'larinda yok // pencelidir
        System.out.println(avciKusgiller.hareket);//hareket ederler
        System.out.println(avciKusgiller.gaga);//gagalari vardir
        System.out.println(avciKusgiller.kanat);//kanatlidirlar
        System.out.println(avciKusgiller.cogalma);//yumurtayla cogalirlar
        System.out.println(avciKusgiller.solunum);//akcigerle nefes alirlar
        System.out.println(avciKusgiller.omur);//yasar ve olurler

        AHayvan avciHayvangiller=new CAvciKuslar();//avciKuslar is a Hayvan diyebiliyoruz
        System.out.println(avciHayvangiller.beslenme);//AHayvan class'ina gider // beslenirler
        //System.out.println(avciKusgiller.pence);//CTE verir. AHayvan class'inda yok // pencelidir
        System.out.println(avciHayvangiller.hareket);//hareket ederler
        //System.out.println(avciHayvangiller.gaga);//AHayvan class'inda yok CTE //gagalari vardir
        //System.out.println(avciHayvangiller.kanat);//AHayvan class'inda yok CTE //kanatlidirlar
        System.out.println(avciHayvangiller.cogalma);//cogalirlar
        System.out.println(avciHayvangiller.solunum);//nefes alirlar
        System.out.println(avciHayvangiller.omur);//yasar ve olurler


    }
}
