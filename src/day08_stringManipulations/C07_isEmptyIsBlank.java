package day08_stringManipulations;

public class C07_isEmptyIsBlank {
    public static void main(String[] args) {

        String str="java candir";

        System.out.println(str.isEmpty());//false

        //str sadece space'ten mi olusuyor?
        System.out.println(str.isBlank());//false

        str="          ";
        System.out.println(str.isEmpty());//false
        System.out.println(str.isBlank());//true

        str="";
        System.out.println(str.isEmpty());//true
        System.out.println(str.isBlank());//true
        

    }
}
