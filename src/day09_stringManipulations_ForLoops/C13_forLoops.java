package day09_stringManipulations_ForLoops;

public class C13_forLoops {
    public static void main(String[] args) {

        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        String str="Java cooook guzel";

        for (int i = str.length()-1; i >=0 ; i--) {

            System.out.print(str.substring(i,i+1));

        }
        //Stringin ters halini yeni bir string olarak kaydedin

        String tersStr="";
        for (int i = str.length()-1; i>=0 ; i--) {
            tersStr+=str.substring(i,i+1);

        }
        System.out.println("\nTers haliyle kaydedilen metin : " +tersStr);
    }
}
