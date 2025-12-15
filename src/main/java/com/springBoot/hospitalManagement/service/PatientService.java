package com.springBoot.hospitalManagement.service;

// import javax.swing.text.html.parser.Entity;

import org.springframework.stereotype.Service;

import com.springBoot.hospitalManagement.entity.Patient;
import com.springBoot.hospitalManagement.repository.PatientRepository;

// import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    // private final EntityManager entityManager;

    @Transactional
    public Patient getPatientById(Long id) {
        Patient p1 = patientRepository.findById(id).orElseThrow(() -> new RuntimeException("Patient not found"));
        Patient p2 = patientRepository.findById(id).orElseThrow(() -> new RuntimeException("Patient not found"));

        System.out.println(p1 == p2); // Should print true due to first-level cache

        p1.setName("Yoyo");

        return p1;
    }
}
