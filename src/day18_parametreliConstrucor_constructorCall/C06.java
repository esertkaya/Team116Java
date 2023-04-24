package day18_parametreliConstrucor_constructorCall;

public class C06 {

    C06(){
        System.out.println("Parametresiz Constructor");
    }
    C06(int sayi){
        //C06(); Java bu sekilde yazimi method call kabul eder
        //yani constructor'lar constructor ismi yazilarak CAGRILAMAZ.

        this();
        //Bir constructor'in icinde baska bir constructor'i call yapmak istersek
        //this(istenen argumentler) yazariz
        System.out.println("int parametreli constructor");
    }

    C06(String str){
        this(3);
        System.out.println("String parametreli constructor");
    }


    public static void main(String[] args) {
        C06 obj=new C06("Java");


    }
}
