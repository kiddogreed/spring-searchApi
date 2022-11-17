package net.javaguides.springboot.Entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "sequence")
public class FiboSequence {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private int limit;
  private String desc;
  private boolean active;
  @CreationTimestamp
  private LocalDateTime dateCreated;
  @UpdateTimestamp
  private LocalDateTime dateUpdated;

  
}
