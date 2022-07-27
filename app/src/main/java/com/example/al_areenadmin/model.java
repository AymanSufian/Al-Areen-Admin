package com.example.al_areenadmin;

public class model
{
    String name , id , email , Patient_Name, Inj_Place , Inj_Des , Calender , Date ;

    model(){

    }



    public model(String name, String id, String email, String patient_Name, String inj_Place, String inj_Des, String calender, String date) {
        this.name = name;
        this.id = id;
        this.email = email;
        Patient_Name = patient_Name;
        Inj_Place = inj_Place;
        Inj_Des = inj_Des;
        Calender = calender;
        Date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPatient_Name() {
        return Patient_Name;
    }

    public void setPatient_Name(String patient_Name) {
        Patient_Name = patient_Name;
    }

    public String getInj_Place() {
        return Inj_Place;
    }

    public void setInj_Place(String inj_Place) {
        Inj_Place = inj_Place;
    }

    public String getInj_Des() {
        return Inj_Des;
    }

    public void setInj_Des(String inj_Des) {
        Inj_Des = inj_Des;
    }

    public String getCalender() {
        return Calender;
    }

    public void setCalender(String calender) {
        Calender = calender;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
