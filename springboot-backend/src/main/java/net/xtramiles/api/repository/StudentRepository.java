package net.xtramiles.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.xtramiles.api.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
