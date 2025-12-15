package com.springBoot.hospitalManagement;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springBoot.hospitalManagement.entity.Patient;
import com.springBoot.hospitalManagement.repository.PatientRepository;
import com.springBoot.hospitalManagement.service.PatientService;

@SpringBootTest
public class PatientTests {
    
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatientRepository() {
        // Test logic for PatientRepository
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);
    }

    @Test
    public void testTransactionMethods(){
        Patient patient = patientService.getPatientById(1L);
        System.out.println(patient);
    }
}
