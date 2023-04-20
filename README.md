# Ex2.Dental Clinic - API
Create the backend corresponding to the appointment management system for a Dental Clinic.
---

 In this first phase of the project, the student has to carry out a complete REST API, with the Spring Framework, that meets the previously stated requirements.

It defines the necessary endpoints so that the backend can comply with what is established, feeding the different frontend views.

 In addition to the aforementioned, the student must include the following functionality:

- [x] mysql
- [x] JPA
- [x] Necessary relationships
- [x] CRUD of the different models.
- [x] Excellent Readme.

---

Index

- [BASIC FEATURES](https://github.com/PaulaSousa2014/Ex2.-API-Clinica-dental#BASIC-FEATURES)
  - [User profile](https://github.com/PaulaSousa2014/Ex2.-API-Clinica-dental#User-profile)
  - [Profile Data Modification](https://github.com/PaulaSousa2014/Ex2.-API-Clinica-dental#Profile-Data-Modification)
  - [Appointment creation](https://github.com/PaulaSousa2014/Ex2.-API-Clinica-dental#Appointment-creation)
  - [Appointment modification](https://github.com/PaulaSousa2014/Ex2.-API-Clinica-dental#Appointment-modification)
  - [Appoiments cancellation](https://github.com/PaulaSousa2014/Ex2.-API-Clinica-dental#[Appoiments-cancellation)
  - [View all appointments a patient have](https://github.com/PaulaSousa2014/Ex2.-API-Clinica-dental#View-all-appointments-a-patient-have)
  - [View all existing appointments (as a dentist)](https://github.com/PaulaSousa2014/Ex2.-API-Clinica-dental#View-all-existing-appointments-(as-a-dentist))
  - [View all patients](https://github.com/PaulaSousa2014/Ex2.-API-Clinica-dental#View-all-patients)
- [ADDITIONAL FEATURES](https://github.com/PaulaSousa2014/Ex2.-API-Clinica-dental#ADDITIONAL-FEATURES)
  - [View Appointment details](https://github.com/PaulaSousa2014/Ex2.-API-Clinica-dental#View-Appointment-details)
  - [Select a dentist at the appointment](https://github.com/PaulaSousa2014/Ex2.-API-Clinica-dental#Select-a-dentist-at-the-appointment)
  - [View Appointments of dentist](https://github.com/PaulaSousa2014/Ex2.-API-Clinica-dental#View-Appointments-of-dentist)
  - [Add types of intervention / consultation to appointments](https://github.com/PaulaSousa2014/Ex2.-API-Clinica-dental#Add-types-of-intervention-/-consultation-to-appointments)

---

## BASIC FEATURES


### User profile

**POST**

`/api/dentist` - create dentist profile

fill body json:

        { 
        "name": "XXXXXX",
        "phone": 88888888
         }

`/api/patient` - create patient profile

fill body json:

       { 
        "name": "XXXXXX",
        "phone": 88888888,
        "insurance": "XXXX"
         }
    
 **DELETE**
 
 `/api/dentist/{id}`- delete dentist profile with id
 `/api/patient/{id}` - delete patient profile with id


### Profile Data Modification

**PUT**

`/api/dentist/{id}` - update dentist profile


    {
    "name": "XXXXXX",
    "phone": 66666666
      }
      

`/api/patient/{id}` - update patient profile

fill body json with the field you want to update
    
    {
    "name": "XXXX",
    "phone": 555555555,
    "insurance": "XXXX"
    }
    

### Appointment creation

**POST**

`/api/appointment` - create a new appointment


fill body json with the fields ( there are 2 types of appointments: "CLEANING" or "CHECKUP")

    {    
    "patient": {
        "id": 3,
        "name": "XXXXX",
        "phone": 666666666,
        "insurance": "XXXXX"
    },
    "dentist": {
        "id": 2,
        "name": "XXXXXX",
        "phone": 222222222
    },
    "date": "2023-04-20T08:23:14.000+00:00",
    "type": "CHECKUP" 
    }
   
   

### Appointment modification

**PUT**


`/api/appointment/{id}` - change an appointment


### Appoiments cancellation

**DELETE**


`/appointment/{id}` - delete appointment by appointment_id


## View all appointments a patient have


**GET**


`/api/appointment/patient/{id}` - List all appointments from patient by patient_id


### View all existing appointments (as a dentist)


**GET**


`/api/appointment` - List all appointments

`/api/appointment/dentist/{id}` - List all appointments for dentist by dentist_id


### View all patients


**GET**


`/api/patient` - List all patients


## ADDITIONAL FEATURES


### View Appointment details

**GET**


`/api/appointment/{id}` - Show appointment details by appointment_id


### Select a dentist at the appointment

See all dentists

**GET**

`/api/dentist`  - Can choose dentist

**POST**

`/api/appointment` - Create an appointment and insert the choosed dentist

### View Appointments of dentist

**GET**

`/api/appointment/dentist/{id}` - List all appointments for dentist by dentist_id


### Add types of intervention / consultation to appointments



