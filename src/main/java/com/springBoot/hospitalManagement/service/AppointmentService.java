package com.springBoot.hospitalManagement.service;

import org.springframework.stereotype.Service;

import com.springBoot.hospitalManagement.entity.Appointment;
import com.springBoot.hospitalManagement.entity.Doctor;
import com.springBoot.hospitalManagement.entity.Patient;
import com.springBoot.hospitalManagement.repository.AppointmentRepository;
import com.springBoot.hospitalManagement.repository.DoctorRepository;
import com.springBoot.hospitalManagement.repository.PatientRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Appointment createNewAppointment(Appointment appointment, Long doctorId, Long patientId) throws IllegalAccessException{
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();
        Patient patient = patientRepository.findById(patientId).orElseThrow();

        if(appointment.getId() != null) throw new IllegalAccessException("Appointment should not have id");

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        patient.getAppointments().add(appointment);

        return appointmentRepository.save(appointment);
    }
    
    @Transactional
    public Appointment reAssignAppointmentToAnotherDoctor(Long appointmentId, Long doctorId){
        Appointment appointment = appointmentRepository.findById(appointmentId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        appointment.setDoctor(doctor); // this will automatically call the update, because it is dirty 

        doctor.getAppointments().add(appointment);  // just for bidirectional consistency

        return appointment;
    }
}
