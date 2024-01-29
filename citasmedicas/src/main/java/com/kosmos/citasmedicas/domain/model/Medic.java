package com.kosmos.citasmedicas.domain.model;

public class Medic {
    private int doctorId;
    private String name;
    private String lastname_1;
    private String lastname_2;
    private String speciality;

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname_1() {
        return lastname_1;
    }

    public void setLastname_1(String lastname_1) {
        this.lastname_1 = lastname_1;
    }

    public String getLastname_2() {
        return lastname_2;
    }

    public void setLastname_2(String lastname_2) {
        this.lastname_2 = lastname_2;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
