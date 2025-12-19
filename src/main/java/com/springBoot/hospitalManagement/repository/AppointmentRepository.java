package com.springBoot.hospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.hospitalManagement.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    
}
