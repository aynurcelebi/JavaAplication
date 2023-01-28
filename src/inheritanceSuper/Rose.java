package inheritanceSuper;

public class Rose extends Flower{
    protected String name = "Gül";

    public Rose(String color) {
        super("kırmızı"); // Üst sınıfın kurucularına erişmek için kullanılır..
    }
    @Override
    public void smell(){
        System.out.println("Rose smell is good");
    }
}
