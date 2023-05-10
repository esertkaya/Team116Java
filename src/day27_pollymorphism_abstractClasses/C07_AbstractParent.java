package day27_pollymorphism_abstractClasses;

public abstract class C07_AbstractParent extends C06_AbstractGP {
    /*
      Abstract bir class'in concrete child'i
      Parent'i olan abstract class'daki tum abstract methodlari
      implement etmek zorundadir

      Concrete olmayan yani abstract child class'lar
      parent abstract class'daki abstract method'lari
      implement etmek zounda degildir
      isterse implement eder isterse etmez

      Ayni sekilde parent abstract class'daki concrete methodlari da
      isterse implement eder, isterse etmez
     */

    void method1(){
        System.out.println("Parent class concrete method1");
    }

    void method4(){
        System.out.println("Parent class concrete method4");
    }
    abstract void method5();
    void method6(){
        System.out.println("Parent class concrete method6");
    }



    }

