package day34_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C03_NestedMap {

    public static void main(String[] args) {

        /*
        Asagidaki body’yi map olarak olusturun
        {
            “firstname” : “Ahmet”,
            “lastname” : “Bulut”,
            “totalprice” : 500,
            “depositpaid” : false,
            “bookingdates” : {
                   “checkin” : “2023-07-21”,
                   “checkout” : “2023-08-10”
                      },
            “additionalneeds” : “wi-fi” }

            key : String
            value : String, Integer, Boolean, Map<String,String>
         */
        Map<String,Object> rezervasyonMap=new HashMap<>();
        rezervasyonMap.put("firstname","Ahmet");
        rezervasyonMap.put("lastname","Bulut");
        rezervasyonMap.put("totalprice",500);
        rezervasyonMap.put("depositpaid",false);

        Map<String,String>bookinDatesMap=new HashMap<>();
        bookinDatesMap.put("checkin","2023-07-21");
        bookinDatesMap.put("checkout","2023-08-10");
        rezervasyonMap.put("bookingdates",bookinDatesMap);
        rezervasyonMap.put("additionalneeds","wi-fi");
        System.out.println(rezervasyonMap);

        /*
                {
                firstname=Ahmet,
                additionalneeds=wi-fi,
                bookingdates={
                                checkin=2023-07-21,
                                checkout=2023-08-10
                                },
                totalprice=500,
                depositpaid=false,
                lastname=Bulut}
         */
        // rezervasyonMap'de isim bilgisini yazdirin
        System.out.println(rezervasyonMap.get("firstname"));
        // rezervasyonMap'de additionalneeds bilgisini yazdirin
        System.out.println(rezervasyonMap.get("additionalneeds")); // wi-fi
        // rezervasyonMap'de soyismin ilk harf bilgisini yazdirin
        System.out.println(((String) rezervasyonMap.get("lastname")).charAt(0)); // B
        System.out.println(rezervasyonMap.get("yas")); // null
        // rezervasyonMap'de checkin bilgisini yazdirin
        System.out.println(((Map) rezervasyonMap.get("bookingdates")).get("checkin"));// 2023-07-21


    }
}
