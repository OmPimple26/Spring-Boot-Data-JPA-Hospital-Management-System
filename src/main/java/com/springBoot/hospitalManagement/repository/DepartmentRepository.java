package com.springBoot.hospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.hospitalManagement.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
    
}
