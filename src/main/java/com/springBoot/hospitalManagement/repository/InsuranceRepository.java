package com.springBoot.hospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.hospitalManagement.entity.Insurance;

public interface InsuranceRepository extends JpaRepository<Insurance, Long>{
    
}
