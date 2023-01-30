package mapYapisi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HasSet {
    public static void main(String[] args) {

        /**
         * Hashset
         * List gibidir. Veri depolamak için kullanılır.
         * Set interface implement eden classlar aynı elemandan sadece 1 tane depolar.
         * Hashing - hashtable mekanizmasına göre ver depolar
         * Hashset elementleri ekleme sırasına göre depolamaz
         *
         */
        List<String> stringList = new ArrayList<>();
        stringList.add("Fırat");
        stringList.add("Emre");
        stringList.add("Doruk");
        stringList.add("Doruk");
        for (String isim : stringList) {
            System.out.println("list içeirsindeki isim: " + isim);
        }
        System.out.println("Listin uzunluğu: " + stringList.size());

        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Fırat");
        stringHashSet.add("Emre");
        stringHashSet.add("Doruk");
        stringHashSet.add("Doruk");

        HashSet<Ogretmen> ss = new HashSet<>();
        ss.add(new Ogretmen());
        ss.add(new Ogretmen());

        for (String isim : stringHashSet) {
            System.out.println("hashset içeirsindeki isim: " + isim);
        }
        System.out.println("hashset uzunluğu: " + stringHashSet.size());
    }
}
