package com.io.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.io.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
