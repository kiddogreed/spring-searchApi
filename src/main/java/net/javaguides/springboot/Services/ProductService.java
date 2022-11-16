package net.javaguides.springboot.Services;
import java.util.List;
import net.javaguides.springboot.Entity.Product;

public interface ProductService {
  List<Product> searchProducts(String query);

  Product createProduct(Product product);
}
