package com.kosmos.citasmedicas.domain.model;

import java.time.LocalDateTime;

public class MedicalAppointment {
    private int dateId;
    private int consultingRoomId;
    private int doctorId;
    private LocalDateTime consultationDate;
    private String patientFullName;
    private boolean status;

    public int getDateId() {
        return dateId;
    }

    public void setDateId(int dateId) {
        this.dateId = dateId;
    }

    public int getConsultingRoomId() {
        return consultingRoomId;
    }

    public void setConsultingRoomId(int consultingRoomId) {
        this.consultingRoomId = consultingRoomId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDateTime getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(LocalDateTime consultationDate) {
        this.consultationDate = consultationDate;
    }

    public String getPatientFullName() {
        return patientFullName;
    }

    public void setPatientFullName(String patientFullName) {
        this.patientFullName = patientFullName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
