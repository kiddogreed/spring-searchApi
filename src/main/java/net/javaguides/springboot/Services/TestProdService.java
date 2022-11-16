package net.javaguides.springboot.Services;
import java.util.List;

import net.javaguides.springboot.Entity.Testprod;

public interface TestProdService {
  List<Testprod> searchTestProducts(String query);

  Testprod createTestProduct(Testprod product);
}
