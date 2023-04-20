package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.dto.Patient;

public interface IPatientDao extends JpaRepository<Patient, Integer> {

}
