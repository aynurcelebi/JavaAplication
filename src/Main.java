public class Main {
    public static void main(String[] args) {

    Product product = new Product();
    product.id=1;
    product.name="Laptop";
    product.description="ASUS Laptop";
    product.price= 5.500;
    product.stockAmount=3;


        System.out.println("Ürün Adı: "+ product.name);
        System.out.println("Ürün Fiytı: "+ product.price);
    }
}