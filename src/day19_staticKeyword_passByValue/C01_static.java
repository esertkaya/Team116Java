package day19_staticKeyword_passByValue;

public class C01_static {

    static String staticV = "Java Candir";
    String instanceV = "Selenium Heyecandir";


    public static void main(String[] args) {
        staticV="Java Hayattir";
        staticMethod();
       // System.out.println(instanceV); burada kullanilamaz


    }

    public static void staticMethod() {
        System.out.println("Static Method");
        System.out.println(staticV);
       // System.out.println(instanceV); burada kullanilamaz
    }

    public void sataticOlmayanMethod() {
        System.out.println("Static Olmayan Method Calisti");
        System.out.println(staticV);
        staticMethod();
        System.out.println(instanceV);//Ikisi de ayricalikli yani static degil.O yuzden kullanilir
    }
}
