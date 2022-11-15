package net.javaguides.springboot.Services;
import java.util.List;
import net.javaguides.springboot.Entity.TestProd;

public interface TestProdService {
  List<TestProd> searchTestProducts(String query);
}
