package net.javaguides.springboot.Controller;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.Entity.Product;
import net.javaguides.springboot.Services.ProductService;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

  private ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }
  
  @GetMapping("/search")
  public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query){
    return ResponseEntity.ok(productService.searchProducts(query));
  }

  @PostMapping("/create")
  public Product createProduct(@RequestBody Product product){
    return productService.createProduct(product);
  }
}