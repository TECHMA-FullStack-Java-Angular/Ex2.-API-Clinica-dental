package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Appointment;


public interface IAppointmentDao extends JpaRepository<Appointment, Integer> {
	
	public List<Appointment> findAllByPatientId(int id); //list All appointments by patient
	
	public List<Appointment> findAllByDentistId(int id); //list All appointments by dentist

}
