package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Appointment;


public interface IAppointmentService {
	
	//CRUD METHODS
			public List<Appointment> showAppointments(); //list All 
			
			public List<Appointment> showAppointmentsByPatientId(int id); //list All appointments by patient
			
			public List<Appointment> showAppointmentsByDentistId(int id); //list All appointments by dentist
			
			public Appointment createAppointment(Appointment patient);	// CREATE
			
			public Appointment findAppointment(int id); // READ
			
			public Appointment updateAppointment(Appointment patient); // UPDATE
			
			public void deleteAppointment(int id);//  DELETE

}
