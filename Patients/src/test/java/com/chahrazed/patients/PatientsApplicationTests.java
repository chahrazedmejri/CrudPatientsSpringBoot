package com.chahrazed.patients;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.chahrazed.patients.entities.Patient;
import com.chahrazed.patients.repos.PatientRepository;
import com.chahrazed.patients.service.PatientService;

@SpringBootTest
class PatientsApplicationTests {
@Autowired
private PatientRepository patientRepository;
@Autowired
private PatientService patientService;
@Test
public void testCreatePatient() {
Patient pat = new Patient("Med hakim khmiri",65.500,new Date());
patientRepository.save(pat);
}
@Test
public void testFindPatient()
{
Patient p = patientRepository.findById(1L).get();
System.out.println(p);
}
@Test
public void testUpdatePatient()
{
Patient p = patientRepository.findById(1L).get();
p.setPrixConsultation(100.0);
patientRepository.save(p);
}
@Test
public void testDeletePatient()
{
patientRepository.deleteById(1L);;
}

@Test
public void testListerTousPatients()
{
List<Patient> pats = patientRepository.findAll();
for (Patient p : pats)
{
System.out.println(p);
}
}
@Test
public void testFindByNomPatientContains()
{
Page<Patient> pat = patientService.getAllPatientsParPage(0,2);
System.out.println(pat.getSize());
System.out.println(pat.getTotalElements());
System.out.println(pat.getTotalPages());
pat.getContent().forEach(p -> {System.out.println(p.toString());
 });
/*ou bien
for (Produit p : prods)
{
System.out.println(p);
} */
}
}