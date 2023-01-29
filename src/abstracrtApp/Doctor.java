package abstracrtApp;

public abstract class Doctor {

    String name;

    public void uzmanlik(){
        System.out.println("Doktor lisans mezunudur..");
    }
    public void maasZamHesaplama(Integer mevcutMaas, int calistigiYilSuresi, int zamKatsayisi){
        mevcutMaas = mevcutMaas * calistigiYilSuresi * zamKatsayisi;
        System.out.println(mevcutMaas);
    }

    public abstract void muayene();
}
