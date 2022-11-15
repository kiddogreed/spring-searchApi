package net.javaguides.springboot.Services.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.Entity.Product;
import net.javaguides.springboot.Repository.ProductRepository;
import net.javaguides.springboot.Services.ProductService;
/**
 * ProductServiceImpl
 */

 @Service
public class ProductServiceImpl implements ProductService {

  

  private ProductRepository productRepository;

  public ProductServiceImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }


  @Override
  public List<Product> searchProducts(String query) {
 
  
     List<Product> products =  productRepository.searchProducts(query);
    
     return products;

    }


  @Override
  public Product createProduct(Product product) {
   
    return productRepository.save(product);
  }

  

  
}