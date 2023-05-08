package day26_inheritanceDataTypeKullanimi_overriding;

public class FAvciKuslar extends EKuslar {
    public void hareket() {
    }

    public void beslenme() {

    }

    public void pence() {

    }

    public void gaga() {

    }


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
          ilk bulunan method gecerli olur
         */
        FAvciKuslar avciKus1=new FAvciKuslar();
        avciKus1.cogalma();//EKuslar- yumurtayla cogalir
        avciKus1.beslenme();//FAvciKuslar- etle beslenirler
        avciKus1.kanat();//FAvciKuslar-kanatlari vardir
        avciKus1.omur();//DHayvan-yasar ve olurler
        avciKus1.gaga();// FAvciKuslar- sivri gagalidir
        avciKus1.hareket();//FAvciKuslar-Ucarlar
        avciKus1.pence();//FAvciKuslar- penceleri vardir
        avciKus1.solunum();//EKuslar-Akcigerle solunum yapar

        EKuslar avciKusgiller=new FAvciKuslar();
        avciKusgiller.cogalma();//EKuslar- yumurtayla cogalir
        avciKusgiller.beslenme();//FAvciKuslar- etle beslenirler
        avciKusgiller.kanat();//FAvciKuslar-kanatlari vardir
        avciKusgiller.omur();//DHayvan-yasar ve olurler
        avciKusgiller.gaga();// FAvciKuslar- sivri gagalidir
        avciKusgiller.hareket();//FAvciKuslar-Ucarlar
        //avciKusgiller.pence();//FAvciKuslar- penceleri vardir Kuslar ve Hayvan'da pence yok CTE
        avciKusgiller.solunum();//EKuslar-Akcigerle solunum yapar


        DHayvan avciHayvangiller=new FAvciKuslar();
        avciHayvangiller.cogalma();//EKuslar- yumurtayla cogalir
        avciHayvangiller.beslenme();//FAvciKuslar- etle beslenirler
        //avciHayvangiller.kanat();//FAvciKuslar-kanatlari vardir//Hayvan'da kanat methodu yok CTE
        avciHayvangiller.omur();//DHayvan-yasar ve olurler
        //avciHayvangiller.gaga();// FAvciKuslar- sivri gagalidir//Hayvan'da gaga methodu yok CTE
        avciHayvangiller.hareket();//FAvciKuslar-Ucarlar
        //avciHayvangiller.pence();//FAvciKuslar- penceleri vardir//Hayvan'da pence methodu yok CTE
        avciHayvangiller.solunum();//EKuslar-Akcigerle solunum yapar



    }
}
