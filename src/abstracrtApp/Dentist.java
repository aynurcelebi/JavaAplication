package abstracrtApp;

public class Dentist extends Doctor implements IMaasHespla{
    int aylikHastaSayisi;

    public void uzmanlik(){
        super.uzmanlik();
        System.out.println("Dentist");
    }

    @Override
    public void muayene() {
        System.out.println("Diş muayenesi yap..");
    }

    @Override
    public void maasHesapla() {
        int doktorMaas = aylikHastaSayisi * 3;
        System.out.println("Doktor's Salary: " + doktorMaas);
    }
}
