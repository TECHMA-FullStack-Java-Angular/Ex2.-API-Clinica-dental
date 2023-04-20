package com.example.demo.dto;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="appointments")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="patient")//an appointments can be made for 1 patient
	private Patient patient;
	@ManyToOne
	@JoinColumn(name="dentist")//an appointments can be made for 1 dentist
	private Dentist dentist;
	@Column(name="appointment_date")
	private Date date;
	@Column(name="appointment_type")
	private Type type;
	
	//Constructors
	public Appointment(int id, Patient patient, Dentist dentist, Date date, Type type) {
		super();
		this.id = id;
		this.patient = patient;
		this.dentist = dentist;
		this.date = date;
		this.type = type;
	}
	public Appointment() {
		super();
	}
	
	//Getters & setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Dentist getDentist() {
		return dentist;
	}
	public void setDentist(Dentist dentist) {
		this.dentist = dentist;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	//print line for appointments
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", patient=" + patient + ", dentist=" + dentist + ", date=" + date + ", type="
				+ type + "]";
	}
	
	

}
