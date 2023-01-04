package constructor_overload;

import constructor_overload.Product;

public class ProductManager {
    public void add(Product product){
        System.out.println("Ürün eklendi: " + product.getName());
    }
}
