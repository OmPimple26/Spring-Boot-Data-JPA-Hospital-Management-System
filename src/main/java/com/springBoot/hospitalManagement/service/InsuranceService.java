package com.springBoot.hospitalManagement.service;

import org.springframework.stereotype.Service;

import com.springBoot.hospitalManagement.entity.Insurance;
import com.springBoot.hospitalManagement.entity.Patient;
import com.springBoot.hospitalManagement.repository.InsuranceRepository;
import com.springBoot.hospitalManagement.repository.PatientRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InsuranceService {
    private final InsuranceRepository insuranceRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Patient assignInsuranceToPatient(Insurance insurance, Long patientId) {
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new EntityNotFoundException("Patient not found with patient id: " + patientId));

        patient.setInsurance(insurance);
        insurance.setPatient(patient);

        return patient;
    }

    @Transactional
    public Patient disAssociateInsuranceFromPatient(Long patientId){
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new EntityNotFoundException("Patient not found with patient id: " + patientId));

        patient.setInsurance(null);
        return patient;
    }

    // HW - Create three appointment for a patient and then delete patient 
}
