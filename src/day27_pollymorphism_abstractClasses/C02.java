package day27_pollymorphism_abstractClasses;

import java.util.ArrayList;

public class C02 extends C01_OverridingReturnType{
    void method1(){

    }

    double method2(){
        //return type VOID veya PRIMITIVE data turu ise
        //overridden method ile overriding methodun
        //return type'lari AYNI OLMALIDIR
        return 3;
    }

    String method3(){
        //return type NON-PPRIMITIVE ISE
        //child class'daki method'un return type'i
        //parent class'daki overridden method'un return type'inin
        //AYNISI veya CHILD CALSSI@I olmalidir
        //(IS-A relationship ile control edilebilir)
        //Covariant
        
        return "Selenium Heyecandir";
    }
    ArrayList<String>method4(){
        return new ArrayList<>();
    }
}
