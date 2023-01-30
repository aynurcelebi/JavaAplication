package mapYapisi;

import java.util.*;

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

        /**
         * HashSet verileri sırasız depolar
         */

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Mercedes");
        hashSet.add("Volvo");
        hashSet.add("Kia");
        hashSet.add("Reanult");
        hashSet.add("BMW");

        /**
         * LinkedHashSet verileri sıralı depolar
         */

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Mercedes");
        linkedHashSet.add("Volvo");
        linkedHashSet.add("Kia");
        linkedHashSet.add("Reanult");
        linkedHashSet.add("BMW");

        /**
         * Treeset verileri alfabetik olarak sıralar
         */

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Mercedes");
        treeSet.add("Volvo");
        treeSet.add("Kia");
        treeSet.add("Reanult");
        treeSet.add("BMW");

        System.out.println("******HashSet**********");
        for (String s : hashSet) {
            System.out.println(s);
        }

        System.out.println("******LinkedHashSet*****");
        for (String s : linkedHashSet) {
            System.out.println(s);
        }

        System.out.println("******TreeSet*****");
        for (String s : treeSet) {
            System.out.println(s);
        }

    }
}
