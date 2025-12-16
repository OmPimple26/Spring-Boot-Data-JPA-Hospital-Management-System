package com.springBoot.hospitalManagement.repository;

import com.springBoot.hospitalManagement.entity.Patient;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.springBoot.hospitalManagement.entity.type.BloodGroupType;

import jakarta.transaction.Transactional;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {


    // 1. JPA Query Methods - Derived Queries:

    // Patient findByName(String name);

    // Patient findByBirthDate(LocalDate birthDate);

    // Optional<Patient> findByBirthDateOrEmail(LocalDate birthDate, String email);

    // List<Patient> findByBirthDateOrEmail(LocalDate birthDate, String email);

    // List<Patient> findByBirthDateBetween(LocalDate startDate, LocalDate endDate);

    // List<Patient> findByNameContaining(String query);

    // List<Patient> findByNameContainingOrderByIdDesc(String query);


    // ------------------------------------------------------------------------------------------------


    // 2. JPQL(Jakarta Persistance Query Language) Queries:

    // @Query("SELECT p FROM Patient p WHERE p.bloodGroup = ?1")
    // List<Patient> findByBloodGroup(@Param("bloodGroup") BloodGroupType bloodGroup);

    // @Query("SELECT p FROM Patient p WHERE p.birthDate > :birthDate")
    // List<Patient> findByBornAfterDate(@Param("birthDate") LocalDate birthDate);

    // @Query("SELECT p.bloodGroup, COUNT(p) FROM Patient p GROUP BY p.bloodGroup")
    // List<Object[]> countEachBloodGroupType();


    // ------------------------------------------------------------------------------------------------


    // 3. Native SQL Queries:

    // @Query(value = "SELECT * FROM patient", nativeQuery = true)
    // List<Patient> findAllPatients();


    // ------------------------------------------------------------------------------------------------


    // 4. Update Query:

    // @Transactional
    // @Modifying
    // @Query("UPDATE Patient p SET p.name = :name WHERE p.id = :id")
    // int updateNameWithId(@Param("name") String name, @Param("id") Long id);


    // ------------------------------------------------------------------------------------------------


    // 5. Projection Query Example: Can be done onlu using JPQL and not Native SQL

    // @Query("SELECT new com.springBoot.hospitalManagement.dto.BloodGroupCountResponseEntity(p.bloodGroup, COUNT(p)) " +
    //        "FROM Patient p GROUP BY p.bloodGroup")
    // List<com.springBoot.hospitalManagement.dto.BloodGroupCountResponseEntity> countEachBloodGroupType();


    // ------------------------------------------------------------------------------------------------


    // 6. Pagination:

    @Query(value = "SELECT * FROM patient", nativeQuery = true)
    Page<Patient> findAllPatients(Pageable pageable);
}
