public class ProductManager {
    public void add(Product product){
        System.out.println("Ürün eklendi: " + product.getName());
        System.out.println("Ürün stok adedi: " + product.getStockAmount());
    }
}
