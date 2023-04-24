package day10_nestedForLoops_methodOlusturmaVeKullanma;

public class C10_asalSayiSonucuyazdirma {
    public static void main(String[] args) {
        asalSayiMiYazdin(37);


    }

    public static void asalSayiMiYazdin(int sayi){
        boolean asalMi=true;
        for (int i = 2; i <sayi ; i++) {
            System.out.println("dene " + i);
            if (sayi % i == 0){
                asalMi=false;
                break;
            }
        }
        /*
            Bir loop'un icerisinde loop'un calismasini durdurmak isterseniz
            break; yazabilirsiniz
         */
        if (asalMi){
            System.out.println("sayi asal");
        }else {
            System.out.println("sayi asal degil");
        }

    }
}
