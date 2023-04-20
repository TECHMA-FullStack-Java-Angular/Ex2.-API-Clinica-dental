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
@Table(name="dentists")
public class Dentist{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="user_name")
	private String name;
	private int phone;
	
	@OneToMany
	@JoinColumn(name="dentist")
	private List<Appointment> appointments;//a dentist can make many appointments

	
	//constructors
	public Dentist(int id, String name, int phone, List<Appointment> appointments) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.appointments = appointments;
	}

	public Dentist() {
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

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dentist")//to avoid infinit loop
	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	
	//print  for dentist
	@Override
	public String toString() {
		return "Dentist [id=" + id + ", name=" + name + ", phone=" + phone + ", appointments=" + appointments + "]";
	}
	
	
	
}
