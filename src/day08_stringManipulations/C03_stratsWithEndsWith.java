package day08_stringManipulations;

public class C03_stratsWithEndsWith {
    public static void main(String[] args) {

        //Bir yazinin bir yazi parcacigiyla baslayip baslamadigini test ederek
        //true veya false cevabini dondurur

        String str="Java cok eglenceli";

        System.out.println(str.startsWith("java"));// false case sensitive
        System.out.println(str.startsWith("Java"));//true

        System.out.println(str.startsWith(str));//true kendisiyle baslar

        System.out.println(str.startsWith(""));//true en basta hiclik var.Java mantiginda her sey hicbir sey ile baslar

        System.out.println("=============================");

        //endsWith metodu istenilen bir yazinin belli bir yazi parcasiyla
        //bitip bitmedigini kontrol eder

        System.out.println(str.endsWith("a")); //false

        System.out.println(str.endsWith("eglenceli"));

        System.out.println(str.endsWith("celi"));

        System.out.println(str.endsWith("Java cok eglenceli"));

        System.out.println(str.length());//18
        System.out.println(str.substring(str.length()-3));//eli

        System.out.println(str.endsWith(str.substring(str.length()-3)));//true


    }
}
