package day22stringBuilders_AccessModifiers;

public class C05_accessModifier {

   public C05_accessModifier (){

    }

    private String privateStr;
    String defaultStr;
    protected String protectedStr;
    public String publicStr;

    private static int privateStaticSayi;
    static int defaultStaticSayi;
    protected static int protectedStaticSayi;
    public static int publicStaticSayi;

    private void privateMethod(){

    }
    void defaultMethod(){

    }
    protected void protectedMethod(){

    }
    public void publicMethod(){

    }

    private static void privatestaticMethod(){

    }
    static void defaultStaticMethod(){

    }
    protected static void protectedStaticMethod(){

    }
    public static void publicStaticMethod(){

    }

    public static void main(String[] args) {

        //tum static class uyeleri direkt kullanilabilir
        //static olmayan tum class uyeleri icin ise obje lazim
        //publicMethod();

        C05_accessModifier obj=new C05_accessModifier();
        System.out.println(obj.privateStr);
        obj.defaultStaticMethod();

        //static class uyelerini obje uzerinden kullanmaya gerek yoktur
        //ama kullanmak istersek java itiraz etmez
        }
        public void classUyeKullanimi(){
        //static olan veya olmayan tum class uyeleri kullanilabilir

            System.out.println(privateStaticSayi);
            publicStaticMethod();
            System.out.println(protectedStr);
            protectedMethod();
        }
    }



