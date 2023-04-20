package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Dentist;

public interface IDentistDao extends JpaRepository<Dentist, Integer>{

}
