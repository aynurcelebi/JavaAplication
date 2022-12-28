public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("ASUS Laptop c-340");
        product.setPrice(5500);
        product.setStockAmount(3);
        //product.getKod();

        ProductManager productManager = new ProductManager();
        productManager.add(product);



    }
}