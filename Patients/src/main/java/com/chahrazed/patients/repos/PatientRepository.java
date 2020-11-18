package com.chahrazed.patients.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chahrazed.patients.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}

