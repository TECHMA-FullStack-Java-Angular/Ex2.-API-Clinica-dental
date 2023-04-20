# <span style="color: green">Ex2.Dental Clinic - API
Create the backend corresponding to the appointment management system for a Dental Clinic.

BASIC FEATURES

- User profile</span>

POST
/api/dentist - create dentist profile

fill body json:
{ 

        "name": "XXXXXX",
        "phone": 88888888
    }

/api/patient - create patient profile

fill body json:
{ 

        "name": "XXXXXX",
        "phone": 88888888,
        "insurance": "XXXX"
    }
    
 DELETE
 
 /api/dentist/{id} - delete dentist profile with id
 /api/patient/{id} - delete patient profile with id


- <span style="color: green">Modification of profile data</span>

PUT
/api/dentist/{id} - update dentist profile

{

    "name": "XXXXXX",
    "phone": 66666666
}

/api/patient/{id} - update patient profile

fill body json with the field you want to update
{

    "name": "XXXX",
    "phone": 555555555,
    "insurance": "XXXX"
}
<span style="color: green">
- appointment creation</span>

POST
/api/appointment - create a new appointment

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
<span style="color: green">
- appointment modification</span>

PUT
/api/appointment/{id} - change an appointment

<span style="color: green">
- cancellation of appointments</span>

DELETE

/appointment/{id} - delete appointment by appointment_id

<span style="color: green">
- See all appointments I have as a patient (only my own)</span>

GET
/api/appointment/patient/{id} - List all appointments from patient by patient_id
<span style="color: green">
- View all existing appointments (as a dentist)</span>

GET
/api/appointment - List all appointments
/api/appointment/dentist/{id} - List all appointments for dentist by dentist_id

<span style="color: green">
- View all patients</span>

GET
/api/patient - List all patients

<span style="color: green">
ADDITIONAL FEATURES

- View an appointment in detail</span>

GET
/api/appointment/{id} - Show appointment details by appointment_id

<span style="color: green">
- Choosing a dentist at the appointment

See all dentists:</span>
GET
/api/dentist  - Can choose dentist

POST 
/api/appointment - Create an appointment and insert the choosed dentist
<span style="color: green">
- As a dentist, being able to see only my appointments</span>

GET
/api/appointment/dentist/{id} - List all appointments for dentist by dentist_id
<span style="color: green">
- Add types of intervention / consultation to appointments</span>

<span style="color: green">
 In this first phase of the project, the student has to carry out a complete REST API, with the Spring Framework, that meets the previously stated requirements.

It defines the necessary endpoints so that the backend can comply with what is established, feeding the different frontend views.

 In addition to the aforementioned, the student must include the following functionality:

- [x] mysql
- [x] JPA
- [x] Necessary relationships
- [x] CRUD of the different models.
- [x] Excellent Readme.</span>
