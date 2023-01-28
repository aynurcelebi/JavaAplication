package inheritanceSuper;

public class Flower extends FlowerBase{

    private String color;
    private  String height;
    public String name = "Lavanta";

    public Flower(String color) {
        super("Gül","jj");
        this.color = color;
       //super.getName();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
    public void smell(){
        System.out.println("Flower smells good");
    }
}
