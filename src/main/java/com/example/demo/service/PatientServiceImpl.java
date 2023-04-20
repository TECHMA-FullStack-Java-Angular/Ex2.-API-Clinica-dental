package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPatientDao;
import com.example.demo.dto.Patient;

@Service
public class PatientServiceImpl implements IPatientService{
	
	@Autowired
	IPatientDao patientDao;

	@Override
	public List<Patient> showPatients() {
		
		return patientDao.findAll();
	}

	@Override
	public Patient createPatient(Patient patient) {
		
		return patientDao.save(patient);
	}

	@Override
	public Patient findPatient(int id) {
		
		return patientDao.findById(id).get();
	}

	@Override
	public Patient updatePatient(Patient patient) {
		
		return patientDao.save(patient);
	}

	@Override
	public void deletePatient(int id) {
		patientDao.deleteById(id);
		
	}
	
	

}
