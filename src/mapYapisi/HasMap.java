package mapYapisi;

import java.util.HashMap;

public class HasMap {


    public static void main(String[] args) {

        HashMap<Integer, String> nameMap = new HashMap<>();

        nameMap.put(15, "Fırat");
        nameMap.put(25, "Batuhan");
        nameMap.put(25, "Murat");//aynı key değerini ekleyince sonucu ne olur?

        System.out.println(nameMap);

        /**
         * Veri alma
         */
        String value = nameMap.get(15);
        System.out.println(value);

        String value2 = nameMap.get(25);

        for (Integer key : nameMap.keySet()) {
            System.out.println("hasmap'in keyi:" + key + " value: " + nameMap.get(key));
        }
    }
}
