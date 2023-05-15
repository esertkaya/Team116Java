package day29_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        /*
          Java'da dosya okuma ve yazma ile ilgili exception'lar
          (IOException==>Input-Output Exception)
          Compile Time'da devreye girip bizi uyarir

          Java ile bilgisyarimizdaki bir dosyaya ulasmak isterseniz
          dosya yoluna ihtiyacimiz olur

          Dosya yolunu String olarak kaydettikten sonra FileInputStream class'indan olusturacagimiz obje ile
          istedigimiz dosyaya erisebiliriz

          Input-Output islemi yapmak istedigimizde
          Java ulasmak istedigimiz dosyanin dosya yolunun dogru oldugundan
          yani o konumda bir dosya bulundugundan ve dosyanin kullanilabilir oldugundan
          emin olmak ister

          bir checked exception olustugunda 2 sekilde bu kirmizi cizgi giderilebilir
          1-exception'i try catc ile handle edebilirsiniz. Yani exception olussa bile calismaya devam etmesini
            saglayabilirsiniz.
          2-Ben dosya yolundan eminim, calismaya devam et, exception olusursa olussun diyebilirsiniz.
            Bunun icin method signature'ina throws FileNotFoundException eklenmelidir
         */

        String dosyaYolu="day29_exceptions/deneme.txt";
        FileInputStream fis=new FileInputStream(dosyaYolu);


    }
}
