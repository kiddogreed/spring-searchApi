package net.javaguides.springboot.Services;

import java.util.List;

import net.javaguides.springboot.Entity.FiboSequence;

public interface FiboSequenceService {
  List<FiboSequence> searchFiboSequence(String query);

  FiboSequence createFiboSequence(FiboSequence fiboSequence);
}
