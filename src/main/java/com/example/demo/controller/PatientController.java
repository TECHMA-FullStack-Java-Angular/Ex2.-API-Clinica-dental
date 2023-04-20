package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Patient;
import com.example.demo.service.PatientServiceImpl;

@RestController
@RequestMapping("/api")
public class PatientController {

	@Autowired
	PatientServiceImpl patientService;
	
	
	@GetMapping("/patient") //show all patients
	public List<Patient> showPatients() {
		return patientService.showPatients();
	}

	@PostMapping("/patient") //create new dentist profile on api
	public Patient createPatient(@RequestBody Patient patient) {

		return patientService.createPatient(patient);
	}
	


	@PutMapping("/patient/{id}") //update patient profile
	public Patient updatePatient(@PathVariable(name = "id") int id, @RequestBody Patient patient) {

		Patient patientSelected = new Patient();
		Patient patientUpdated = new Patient();

		patientSelected = patientService.findPatient(id);
		if (patient.getName() != null) {
			patientSelected.setName(patient.getName());
			patientUpdated = patientService.updatePatient(patientSelected);
		} else if (patient.getPhone() != 0) {
			patientSelected.setPhone(patient.getPhone());
			patientUpdated = patientService.updatePatient(patientSelected);
		} else if (patient.getAppointments() != null) {
			patientSelected.setAppointments(patient.getAppointments());
			patientUpdated = patientService.updatePatient(patientSelected);
		}else if (patient.getInsurance() != null) {
			patientSelected.setInsurance(patient.getInsurance());
			patientUpdated = patientService.updatePatient(patientSelected);
		}

		else {
			patientUpdated = patientSelected;
		}

		return patientUpdated;
	}

	@DeleteMapping("/patient/{id}")
	public void deletePatient(@PathVariable(name = "id") int id) {
		patientService.deletePatient(id);
	}

}
