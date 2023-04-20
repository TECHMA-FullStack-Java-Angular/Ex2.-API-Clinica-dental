package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Dentist;



public interface IDentistService {
	
	//CRUD METHODS
	public List<Dentist> showDentists(); //list All 
	
	public Dentist createDentist(Dentist dentist);	// CREATE
	
	public Dentist findDentist(int id); // READ
	
	public Dentist updateDentist(Dentist dentist); // UPDATE
	
	public void deleteDentist(int id);//  DELETE

}
