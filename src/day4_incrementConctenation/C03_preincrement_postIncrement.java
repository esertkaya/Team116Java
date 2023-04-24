package day4_incrementConctenation;

public class C03_preincrement_postIncrement {
    public static void main(String[] args) {

        int a=10;
        System.out.println(a++);// hem yazdirma var, hem artirma var

        System.out.println(a); // 11

        System.out.println(++a);// 12 hem yazdirma var hem artirma var

        System.out.println(a); // 12

        int b=a++;
        System.out.println("a : " + a + " , b : "+ b);// a: 13 , b:12

        a=--b;

        System.out.println("a : " + a + " , b : "+ b); //a : 11 , b : 11

        int c=a++ + ++b;

        System.out.println("a : " + a + " , b : "+ b + " , c : " +c);

        int x=20;
        System.out.println(--x); // 19

        System.out.println(x++); // 19

        System.out.println(++x); // 21

        int y=++x;
        System.out.println("x : " + x + " , y : "+ y); //x : 22 , y : 22

        x=--y;
        System.out.println("x : " + x + " , y : "+ y);

        y=x++;
        System.out.println("x : " + x + " , y : "+ y); // x : 22 , y : 21

        System.out.println(x++ + ++y);






    }
}
