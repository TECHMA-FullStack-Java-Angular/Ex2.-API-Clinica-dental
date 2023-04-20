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

import com.example.demo.dto.Dentist;
import com.example.demo.service.DentistServiceImpl;

@RestController
@RequestMapping("/api")
public class DentistController {
	
	@Autowired
	DentistServiceImpl dentistService;
	
	@GetMapping("/dentist") //show all dentists 
	public List<Dentist> showDentists() {
		return dentistService.showDentists();
	}

	@PostMapping("/dentist") //insert new dentist on api
	public Dentist createDentist(@RequestBody Dentist dentist) {

		return dentistService.createDentist(dentist);
	}
	
//	@GetMapping("/dentist/{id}") //find dentist on api
//	public Dentist findDentist(@PathVariable(name = "id") int id) {
//		return  dentistService.findDentist(id);
//		}

	@PutMapping("/dentist/{id}") //update dentist profile
	public Dentist updateDentist(@PathVariable(name = "id") int id, @RequestBody Dentist dentist) {

		Dentist dentistSelected = new Dentist();
		Dentist dentistUpdated = new Dentist();

		dentistSelected = dentistService.findDentist(id);
		if (dentist.getName() != null) {
			dentistSelected.setName(dentist.getName());
			dentistUpdated = dentistService.updateDentist(dentistSelected);
		} else if (dentist.getPhone() != 0) {
			dentistSelected.setPhone(dentist.getPhone());
			dentistUpdated = dentistService.updateDentist(dentistSelected);
		} else if (dentist.getAppointments() != null) {
			dentistSelected.setAppointments(dentist.getAppointments());
			dentistUpdated = dentistService.updateDentist(dentistSelected);
		}

		else {
			dentistUpdated = dentistSelected;
		}

		return dentistUpdated;
	}

	@DeleteMapping("/dentist/{id}")
	public void deleteDentist(@PathVariable(name = "id") int id) {
		dentistService.deleteDentist(id);
	}

}
