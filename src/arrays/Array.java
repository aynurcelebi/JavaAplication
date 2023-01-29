package arrays;

public class Array {
    public static void main(String[] args) {

        int[] arrDizi = new int[5];
        arrDizi[0] = 28;
        arrDizi[arrDizi.length -1] = 235;

        // foreac döngüsünün kısa yolu "iter" kelimesidir.

        for(int i: arrDizi){
            System.out.println(i);
        }
    }
}
