# Ex2.Dental Clinic - API
Create the backend corresponding to the appointment management system for a Dental Clinic.

BASIC FEATURES

- User profile

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


- Modification of profile data

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

- appointment creation
- appointment modification
- cancellation of appointments
- See all appointments I have as a client (only my own)
- View all existing appointments (as a dentist)
-
- View all patients

GET
/api/patient - List all patients


ADDITIONAL FEATURES

- View an appointment in detail
- Choosing a dentist at the appointment

See all dentists:
GET /api/dentist  - Can select dentist id

- As a doctor, being able to see only my appointments
- Add types of intervention / consultation to appointments

In this first phase of the project, the student has to carry out a complete REST API, with the Spring Framework, that meets the previously stated requirements.

It defines the necessary endpoints so that the backend can comply with what is established, feeding the different frontend views.

 In addition to the aforementioned, the student must include the following functionality:

- [x] mysql
- [x] JPA
- [x] Necessary relationships
- [x] CRUD of the different models.
- [x] Excellent Readme.
