package abstracrtApp;

public class Main {
    public static void main(String[] args) {

        Dentist dentist = new Dentist();
        dentist.maasZamHesaplama(5000,4,20);
        dentist.uzmanlik();

        EyeDoctor eyeDoctor = new EyeDoctor();
        eyeDoctor.muayene();


    }
}
