package com.springBoot.hospitalManagement;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.springBoot.hospitalManagement.entity.Patient;
import com.springBoot.hospitalManagement.entity.type.BloodGroupType;
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
        // List<Patient> patientList = patientRepository.findAll();
        // System.out.println(patientList);

        List<Patient> patientList = patientRepository.findAllPatientWithAppointment();
        System.out.println(patientList);
    }

    @Test
    public void testTransactionMethods(){
        // Patient patient = patientService.getPatientById(1L);
        // Patient patient = patientRepository.findById(1L).orElseThrow(() -> new RuntimeException("Patient not found"));
        // System.out.println(patient);

        // Example 1 -
        // Patient patient = patientRepository.findByName("Diya Patel");
        // System.out.println(patient);

        // Example 2 -
        // List<Patient> patientList = patientRepository.findByBirthDateOrEmail(LocalDate.of(1988, 03, 15), "neha.iyer@example.com");

        // Example 3 -
        // List<Patient> patientList = patientRepository.findByBirthDateBetween(LocalDate.of(1985, 01, 01), LocalDate.of(1995, 12, 31));

        // Example 4 -
        // List<Patient> patientList = patientRepository.findByNameContaining("Di");

        // Example 5 -
        // List<Patient> patientList = patientRepository.findByNameContainingOrderByIdDesc("Di");

        // for (Patient patient : patientList) {
        //     System.out.println(patient);
        // }

        // Example 6 -
        // List<Patient> patientList = patientRepository.findByBloodGroup(BloodGroupType.A_POSITIVE);

        // Example 7 -
        // List<Patient> patientList = patientRepository.findByBornAfterDate(LocalDate.of(1993, 03, 14));

        // for (Patient patient : patientList) {
        //     System.out.println(patient);
        // }

        // Example 8 -
        // List<Object[]> bloodGroupList = patientRepository.countEachBloodGroupType();
        // for (Object[] objects : bloodGroupList) {
        //     System.out.println("Blood Group: " + objects[0] + ", Count: " + objects[1]);
        // }

        // Example 9 -
        // List<Patient> patientList = patientRepository.findAllPatients();

        // for (Patient patient : patientList) {
        //     System.out.println(patient);
        // }

        // Example 10 -
        // int rowsUpdated = patientRepository.updateNameWithId("Arav Sharma", 1L);
        // System.out.println("Number of rows updated: " + rowsUpdated);

        // Example 11 -
        // List<com.springBoot.hospitalManagement.dto.BloodGroupCountResponseEntity> bloodGroupList = patientRepository.countEachBloodGroupType();
        // for (com.springBoot.hospitalManagement.dto.BloodGroupCountResponseEntity bloodGroupCountResponse : bloodGroupList) {
        //     System.out.println(bloodGroupCountResponse);
        //     // System.out.println("Blood Group: " + bloodGroupCountResponse.getBloodGroupType() + ", Count: " + bloodGroupCountResponse.getCount());
        // }

        // Example 12 -
        // Page<Patient> patientList = patientRepository.findAllPatients(PageRequest.of(0, 2));
        // Page<Patient> patientList = patientRepository.findAllPatients(PageRequest.of(1, 2));

        // Page<Patient> patientList = patientRepository.findAllPatients(PageRequest.of(0, 2, org.springframework.data.domain.Sort.by("name")));

        // for (Patient patient : patientList) {
        //     System.out.println(patient);
        // }
    }
}
