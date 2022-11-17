package net.javaguides.springboot.Services.impl;

import net.javaguides.springboot.Entity.FiboSequence;
import net.javaguides.springboot.Repository.FiboSequenceRepository;

import net.javaguides.springboot.Services.FiboSequenceService;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class FiboSequenceServiceImpl implements FiboSequenceService{

  

  private FiboSequenceRepository fiboSequenceRepository;

  public FiboSequenceServiceImpl(FiboSequenceRepository fiboSequenceRepository) {
    this.fiboSequenceRepository = fiboSequenceRepository;
  }

  @Override
  public List<FiboSequence> searchFiboSequence(String query) {
    
    List<FiboSequence> fiboSequence =  fiboSequenceRepository.searchFiboSequence(query);
    return fiboSequence;
  }

  @Override
  public FiboSequence createFiboSequence(FiboSequence fiboSequence) {
    // TODO Auto-generated method stub
    return fiboSequenceRepository.save(fiboSequence);
  }
  
}
