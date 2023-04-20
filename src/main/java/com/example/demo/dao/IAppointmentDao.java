package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Appointment;


public interface IAppointmentDao extends JpaRepository<Appointment, Integer> {

}
