package com.chahrazed.patients.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.chahrazed.patients.entities.Patient;
import com.chahrazed.patients.repos.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {
@Autowired
PatientRepository patientRepository;
@Override
public Patient savePatient(Patient p) {
return patientRepository.save(p);
}
@Override
public Patient updatePatient(Patient p) {
return patientRepository.save(p);
}
@Override
public void deletePatient(Patient p) {
patientRepository.delete(p);
}
 @Override
public void deletePatientById(Long id) {
patientRepository.deleteById(id);
}
@Override
public Patient getPatient(Long id) {
return patientRepository.findById(id).get();
}
@Override
public List<Patient> getAllPatients() {
return patientRepository.findAll();
}
@Override
public Page<Patient> getAllPatientsParPage(int page, int size) {
   return patientRepository.findAll(PageRequest.of(page, size));
}
}