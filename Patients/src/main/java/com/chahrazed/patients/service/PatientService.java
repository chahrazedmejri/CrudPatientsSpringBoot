package com.chahrazed.patients.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.chahrazed.patients.entities.Patient;

public interface PatientService {
	Patient savePatient(Patient p);
	Patient updatePatient(Patient p);
	
	void deletePatient(Patient p);
	 void deletePatientById(Long id);
	 
	 Patient getPatient(Long id);
	List<Patient> getAllPatients();
	Page<Patient> getAllPatientsParPage(int page, int size);

	

}
