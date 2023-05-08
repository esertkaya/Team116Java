package day26_inheritanceDataTypeKullanimi_overriding;

public class Overriding3 extends Overriding2 {
    public void method1(){
        System.out.println("Overriding3 method1");
    }

    @Override
    void method3() {
        super.method3();
    }
    /*
      Overriding methodu intellij'e de olusturtabiliriz.
      Bu durumda Intellij 2 sey ekler:
      1 : @Override Annaotation
          Kullanmak zorunda degiliz
          Silerseniz CTE olmaz
          @Override notasyonu parent class'daki
          overridden methodu control eder ve silinirse
          CTE verir

      2 : super.method3()
          Mecburi degildir
          Silerseniz CTE olmaz
          Bir class'da hem overridden method
          hem overriding method calismaz

           Eger en guncel method ile birlikte
           parent class'da gecersiz kilinan(overridden)
           method'un da calismasini istersek
           super.method3() kullanabiliriz
     */

    public static void main(String[] args) {
        Overriding3 obj1=new Overriding3();
        obj1.method1();//Overriding3 method1
        obj1.method2();//Overriding2 method2

        Overriding2 obj2=new Overriding3();
        obj2.method1();//Overriding3 method1
        obj2.method2();//Overriding2 method2

        Overriding1 obj3=new Overriding3();
        obj3.method1();//Overriding3 method1
        obj3.method2();//Overriding2 method2

        Overriding1 obj4=new Overriding1();
        obj4.method1();//Overriding1 Method1
        obj4.method2();//Overriding1 Method1




    }
}
