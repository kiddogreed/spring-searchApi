package net.javaguides.springboot.Services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.Entity.Testprod;
import net.javaguides.springboot.Repository.TestProdRepository;
import net.javaguides.springboot.Services.TestProdService;


@Service
public class TestProdServiceImpl implements TestProdService{

  private TestProdRepository testProdRepository;

  
  public TestProdServiceImpl(TestProdRepository testProdRepository) {
    this.testProdRepository = testProdRepository;
  }


  @Override
  public List<Testprod> searchTestProducts(String query) {
   
    List<Testprod> testProds = testProdRepository.searchProducts(query);
    return testProds;
  }


  @Override
  public Testprod createTestProduct(Testprod testProds) {
   
    return testProdRepository.save(testProds);
  }

  
}