package net.javaguides.springboot.Controller;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import net.javaguides.springboot.Services.FiboSequenceService;
import net.javaguides.springboot.Entity.FiboSequence;

@RestController
@RequestMapping("api/v1/fibonacci")
public class FiboSequenceController {
  
  private FiboSequenceService fibonaSequenceService;
  

  public FiboSequenceController(FiboSequenceService fibonaSequenceService) {
    this.fibonaSequenceService = fibonaSequenceService;
  }


  @GetMapping("/sequence") ResponseEntity<List<FiboSequence>> searchFiboSequence(@RequestParam("query") String query){
    return ResponseEntity.ok(fibonaSequenceService.searchFiboSequence(query));
  
  }

  @PostMapping("/add")
  public FiboSequence createProduct(@RequestBody FiboSequence fiboSequence){
    return fibonaSequenceService.createFiboSequence(fiboSequence);
  }
}
