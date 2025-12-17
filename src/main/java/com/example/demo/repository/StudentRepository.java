package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exmaple.demo.entity.Student;
@Repository
public interface StudentRepository extends Jparepository<Student,Integer>{

}