package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListYapisi {
    public static void main(String[] args) {

        int s = 5;
        ArrayList numbers = new ArrayList();
        numbers.add("Fırat");
        numbers.add("Murat");
        numbers.add(s);
        numbers.add(new Ogretmen());
        System.out.println(numbers);

        /**
         *listeye veri ekleme
         */
        List<String> list = new ArrayList<>();
        list.add("Fırat");//0
        list.add("Doruk");//1

        /**
         * listeden veri alma
         */
        String str = list.get(0);
        System.out.println(str);

        /**
         * size
         */
        System.out.println("integer listesi uzunluğu: " + list.size());

        /**
         * Lİst verileri içerisinde dolanma
         */

        List<String> isimListesi = new ArrayList<>();
        isimListesi.add("Murat");
        isimListesi.add("Ahmet");
        isimListesi.add("Mehmet");
        isimListesi.add("Ayşe");
        isimListesi.add("Fatma");
        System.out.println(isimListesi);
    }
}
