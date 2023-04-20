package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Patient;

public interface IPatientService {
	
	//CRUD METHODS
		public List<Patient> showPatients(); //list All 
		
		public Patient createPatient(Patient patient);	// CREATE
		
		public Patient findPatient(int id); // READ
		
		public Patient updatePatient(Patient patient); // UPDATE
		
		public void deletePatient(int id);//  DELETE

}
