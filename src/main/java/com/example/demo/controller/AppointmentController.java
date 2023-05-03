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

import com.example.demo.dto.Appointment;
import com.example.demo.service.AppointmentServiceImpl;

@RestController
@RequestMapping("/api")
public class AppointmentController {
	
	@Autowired
	AppointmentServiceImpl appointmentService;
	
	

	@GetMapping("/appointment") //show all appointments
	public List<Appointment> showAppointments() {
		return appointmentService.showAppointments();
	}
	
	@GetMapping("/appointment/dentist/{id}") //show all appointments for dentist
	public List<Appointment> showAppointmentsByDentistId(@PathVariable(name = "id") int id) {
		return appointmentService.showAppointmentsByDentistId(id);
	}
	
	@GetMapping("/appointment/patient/{id}") //show all appointments from patient
	public List<Appointment> showAppointmentsByPatientId(@PathVariable(name = "id") int id) {
		return appointmentService.showAppointmentsByPatientId(id);
	}
	
	
	@GetMapping("/appointment/{id}") //show appointment by id
	public Appointment findAppointment(@PathVariable(name = "id") int id) {
		return  appointmentService.findAppointment(id);
		}

	@PostMapping("/appointment") //create new apppointment on api
	public Appointment createAppointment(@RequestBody Appointment appointment) {

		return appointmentService.createAppointment(appointment);
	}
	


	@PutMapping("/appointment/{id}") //update appointment
	public Appointment updateAppointment(@PathVariable(name = "id") int id, @RequestBody Appointment appointment) {

		Appointment appointmentSelected = new Appointment();
		Appointment appointmentUpdated = new Appointment();

		appointmentSelected = appointmentService.findAppointment(id);
		if (appointment.getPatient() != null) {
			appointmentSelected.setPatient(appointment.getPatient());
			appointmentUpdated = appointmentService.updateAppointment(appointmentSelected);
		} else if (appointment.getDentist() != null) {
			appointmentSelected.setDentist(appointment.getDentist());
			appointmentUpdated = appointmentService.updateAppointment(appointmentSelected);
		} else if (appointment.getType() != null) {
			appointmentSelected.setType(appointment.getType());
			appointmentUpdated = appointmentService.updateAppointment(appointmentSelected);
		}else if (appointment.getDate() != null) {
			appointmentSelected.setDate(appointment.getDate());
			appointmentUpdated = appointmentService.updateAppointment(appointmentSelected);
		}else {
			appointmentUpdated = appointmentSelected;
		}

		return appointmentUpdated;
	}

	@DeleteMapping("/appointment/{id}") //delete appointment by id
	public void deleteAppointment(@PathVariable(name = "id") int id) {
		appointmentService.deleteAppointment(id);
	}

}
