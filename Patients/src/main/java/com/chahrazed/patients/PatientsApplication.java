package com.chahrazed.patients;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chahrazed.patients.entities.Patient;
import com.chahrazed.patients.service.PatientService;

@SpringBootApplication
public class PatientsApplication implements CommandLineRunner {
@Autowired
PatientService patientService;
public static void main(String[] args) {
	SpringApplication.run(PatientsApplication.class, args);
}
@Override
public void run(String... args) throws Exception {
	patientService.savePatient(new Patient("lilya zoghbi", 260.0, new Date()));
	patientService.savePatient(new Patient("chahrazed mejri", 280.0, new Date()));
	patientService.savePatient(new Patient("sirin hamdi", 90.0, new Date()));
}
}