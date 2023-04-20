package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAppointmentDao;
import com.example.demo.dto.Appointment;

@Service
public class AppointmentServiceImpl implements IAppointmentService{
	
	@Autowired
	IAppointmentDao appointmentDao;

	@Override
	public List<Appointment> showAppointments() {
		
		return appointmentDao.findAll();
	}

	@Override
	public List<Appointment> showAppointmentsByPatientId(int id) {
	
		return appointmentDao.findAllByPatientId(id);
	}

	@Override
	public List<Appointment> showAppointmentsByDentistId(int id) {
		
		return appointmentDao.findAllByDentistId(id);
	}

	@Override
	public Appointment createAppointment(Appointment patient) {
		
		return appointmentDao.save(patient);
	}

	@Override
	public Appointment findAppointment(int id) {
		
		return appointmentDao.findById(id).get();
	}

	@Override
	public Appointment updateAppointment(Appointment patient) {
		
		return appointmentDao.save(patient);
	}

	@Override
	public void deleteAppointment(int id) {
		appointmentDao.deleteById(id);
		
	}

}
