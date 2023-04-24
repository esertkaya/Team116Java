package day17_Constructers;

public class C06_hastaneRunner {

    C05_Hastane personel2=new C05_Hastane();


    public static void main(String[] args) {

        C05_Hastane personel1=new C05_Hastane();
        System.out.println(personel1.personelIsmi);
        System.out.println(personel1.personelTelefon);
        System.out.println(personel1.personelAdresi);
        System.out.println(personel1.personelTuru);
        System.out.println(personel1.maas());

        personel1.personelIsmi="Adem";
        personel1.personelAdresi="Cankaya";
        personel1.personelTelefon="05324758373";
        personel1.personelTuru="Doktor";


        System.out.println(personel1.personelIsmi);
        System.out.println(personel1.personelTelefon);
        System.out.println(personel1.personelAdresi);
        System.out.println(personel1.personelTuru);
        System.out.println(personel1.maas());
    }
}
