package net.javaguides.springboot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.javaguides.springboot.Entity.FiboSequence;

public interface FiboSequenceRepository extends JpaRepository<FiboSequence,Long> {
  
  @Query("SELECT f from FiboSequence f where "+
  "f.desc LIKE CONCAT('%',:query,'%')")
List<FiboSequence> searchFiboSequence(String query);
}
