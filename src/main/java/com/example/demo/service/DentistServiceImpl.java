package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDentistDao;
import com.example.demo.dto.Dentist;

@Service
public class DentistServiceImpl implements IDentistService{
	
	@Autowired
	IDentistDao dentistDao;

	@Override
	public List<Dentist> showDentists() {
		
		return dentistDao.findAll();
	}

	@Override
	public Dentist createDentist(Dentist dentist) {
		
		return dentistDao.save(dentist);
	}

	@Override
	public Dentist findDentist(int id) {
		
		return dentistDao.findById(id).get();
	}

	@Override
	public Dentist updateDentist(Dentist dentist) {
		
		
		return dentistDao.save(dentist);
	}

	@Override
	public void deleteDentist(int id) {
		dentistDao.deleteById(id);
		
	}

}
