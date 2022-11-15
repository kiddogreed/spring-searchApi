package net.javaguides.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import net.javaguides.springboot.Entity.TestProd;

public interface TestProdRepository extends JpaRepository<TestProd, Long> {
  
  @Query("SELECT t from Testprod t where "+
  "t.name LIKE CONCAT('%',:query,'%')"+
  "OR t.desc LIKE CONCAT('%',:query,'%')")
  
  List<TestProd> searchProducts(String query);
}
 