package net.javaguides.springboot.Services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.Entity.TestProd;
import net.javaguides.springboot.Repository.TestProdRepository;
import net.javaguides.springboot.Services.TestProdService;


@Service
public class TestProdServiceImpl implements TestProdService{

  private TestProdRepository testProdRepository;

  
  public TestProdServiceImpl(TestProdRepository testProdRepository) {
    this.testProdRepository = testProdRepository;
  }


  @Override
  public List<TestProd> searchTestProducts(String query) {
   
    List<TestProd> testProds = testProdRepository.searchProducts(query);
    return testProds;
  }

  
}