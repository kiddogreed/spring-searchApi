package net.javaguides.springboot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.javaguides.springboot.Entity.Product;

/**
 * ProductRepository
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

  @Query("SELECT p from Product p where "+
        "p.name LIKE CONCAT('%',:query,'%')"+
        "OR p.description LIKE CONCAT('%',:query,'%')")
  List<Product> searchProducts(String query);

  //use of native query
  // @Query("SELECT * from products p where "+
  //       "p.name LIKE CONCAT('%',:query,'%')"+
  //       "OR p.description LIKE CONCAT('%',:query,'%')",nativeQuery=true)
  // List<Product> searchProductSQL(String query);


  
}