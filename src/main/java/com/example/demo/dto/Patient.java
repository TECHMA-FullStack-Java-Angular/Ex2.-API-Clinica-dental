package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="patients")
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="user_name")
	private String name;
	private int phone;
	private String insurance;
	
	@OneToMany
	@JoinColumn(name="patient")
	private List<Appointment> appointments;//a patient can have many appointments
	
	//constructors

	public Patient(int id, String name, int phone, String insurance, List<Appointment> appointments) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.insurance = insurance;
		this.appointments = appointments;
	}

	public Patient() {
		super();
	}

	//getters & setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")//to avoid infinite loop
	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	//print line for patient
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", phone=" + phone + ", insurance=" + insurance
				+ ", appointments=" + appointments + "]";
	}
	
	

}
