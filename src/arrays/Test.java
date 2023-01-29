package arrays;

public class Test {
    public static void main(String[] args) {

        Ogretmen[] ogretmenDizisi = new Ogretmen[4];
        ogretmenDizisi[0] = new Ogretmen();
        ogretmenDizisi[1] = new Ogretmen();

        for (Ogretmen ogretmen : ogretmenDizisi) {
            if (ogretmen != null) {
                ogretmen.getAdi();
                ogretmen.getYasi();
            }


        }
    }
}