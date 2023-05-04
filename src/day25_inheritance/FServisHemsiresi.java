package day25_inheritance;

public class FServisHemsiresi extends DHemsire {
    String str="Servis Hemsiresi";
    int numara=20;

    public static void main(String[] args) {
        FServisHemsiresi sh1 = new FServisHemsiresi();
        sh1.staticOlmayanMethod();


    }
    public void staticOlmayanMethod(){
        nobet();//3
        this.nobet();//3
        super.nobet();//2
        maas();
        this.maas();
        super.maas();
        calismaGunu();
        this.calismaGunu();
        //super.calismaGunu(); //CTE

        String str="Method";

        System.out.println(str);//Method
        System.out.println(this.str);//Servis Hemsiresi
        System.out.println(super.str);//Hemsire

        System.out.println(numara);//20
        System.out.println(this.numara);//20
        System.out.println(super.numara);//30

        System.out.println(izindeMi);//false
        System.out.println(this.izindeMi);//false
        System.out.println(super.izindeMi);//false

        char ilklHarf='J';
        System.out.println(ilklHarf);//J
       // System.out.println(this.ilklHarf);//CTE
       // System.out.println(super.ilklHarf);//CTE
    }
    public void nobet(){
        System.out.println("Servis hemsireleri haftada 3 gun nobet tutar");
    }
    public void calismaGunu(){
        System.out.println("Servis hemsireleri haftada 4 gun calisirlar");
    }
}