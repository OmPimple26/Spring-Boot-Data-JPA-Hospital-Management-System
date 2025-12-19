package com.springBoot.hospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.hospitalManagement.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{
    
}
