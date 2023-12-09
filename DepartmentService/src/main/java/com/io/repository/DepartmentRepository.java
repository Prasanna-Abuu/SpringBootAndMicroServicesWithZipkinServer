package com.io.repository;

import org.springframework.stereotype.Repository;

import com.io.entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
