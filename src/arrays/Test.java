package arrays;

public class Test {
    public static void main(String[] args) {

        int[] arrDizi = new int[5];
        arrDizi[0] = 28;
        arrDizi[arrDizi.length - 1] = 234;


        for (int i = 0; i < arrDizi.length ; i++) {
            System.out.println(i);
        }
    }
}
