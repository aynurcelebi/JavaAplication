package arrayList;

import java.util.ArrayList;

public class ArrayListYapisi {
    public static void main(String[] args) {

        int s = 5;
        ArrayList numbers = new ArrayList();
        numbers.add("Fırat");
        numbers.add("Murat");
        numbers.add(s);
        numbers.add(new Ogretmen());
        System.out.println(numbers);
    }
}
