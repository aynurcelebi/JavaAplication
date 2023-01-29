package abstracrtApp;

public class EyeDoctor extends Doctor {
    @Override
    public void muayene() {
        System.out.println("Göz muayenesi yap..");
    }
    public void uzmanlik(){
        super.uzmanlik();
        System.out.println("EyeDoctor");
    }

}
