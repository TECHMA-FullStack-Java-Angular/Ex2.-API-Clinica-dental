CREATE DATABASE IF NOT EXISTS db_clinic;
USE db_clinic;

CREATE TABLE IF NOT EXISTS dentists(
	id int auto_increment,
	user_name VARCHAR(100),
	phone int,
    CONSTRAINT PK_dentists PRIMARY KEY (id)
	);
    
    CREATE TABLE IF NOT EXISTS patients(
	id int auto_increment,
	user_name VARCHAR(100),
	phone int,
    insurance VARCHAR(50),
    CONSTRAINT PK_patients PRIMARY KEY (id)
	);
    
	CREATE TABLE IF NOT EXISTS appointments (
    id int auto_increment,
    patient int,
    dentist int,
    appointment_date datetime,
    appointment_type ENUM('CHECKUP','CLEANING'),
    CONSTRAINT PK_appointments PRIMARY KEY (id),
    CONSTRAINT FK_appointments_patients FOREIGN KEY (patient) REFERENCES patients(id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT FK_appointments_users FOREIGN KEY (dentist) REFERENCES dentists(id) ON DELETE CASCADE ON UPDATE CASCADE
);

insert into dentists (id, user_name, phone)values(1,'Dentist 1',111111111);
insert into dentists (id, user_name, phone)values(2,'Dentist 2',222222222);
insert into dentists (id, user_name, phone)values(3,'Dentist 2',333333333);
insert into patients (id, user_name, phone, insurance)values(1,'Patient 1',444444444, 'adeslas');
insert into patients (id, user_name, phone, insurance)values(2,'Patient 2',555555555, 'dkv');
insert into patients (id, user_name, phone, insurance)values(3,'Patient 3',666666666, 'mapfre');
insert into appointments (id, patient, dentist, appointment_date, appointment_type)values(1,3,2,NOW(),'CHECKUP');
insert into appointments (id, patient, dentist, appointment_date, appointment_type)values(2,2,1,NOW(),'CLEANING');
insert into appointments (id, patient, dentist, appointment_date, appointment_type)values(3,1,3,NOW(),'CHECKUP');
