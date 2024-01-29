package com.kosmos.citasmedicas.domain.service;

import com.kosmos.citasmedicas.domain.model.MedicalAppointment;
import com.kosmos.citasmedicas.domain.repository.MedicalAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class MedicalAppointmentService {

    @Autowired
    private MedicalAppointmentRepository medicalAppointmentRepository;

    public MedicalAppointment save(MedicalAppointment medicalAppointment) {
        return medicalAppointmentRepository.save(medicalAppointment);
    }

    public Optional<List<MedicalAppointment>> getByConsultingRoomAndDoctorAndConsultationDate(int consultingRoomId, int doctorId, LocalDateTime consultationDate) {
        return medicalAppointmentRepository.getByConsultingRoomAndDoctorAndConsultationDate(consultingRoomId, doctorId, consultationDate);
    }

    public List<MedicalAppointment> getAll() {
        return medicalAppointmentRepository.getAll();
    }

    public boolean delete(int dateId) {
        medicalAppointmentRepository.delete(dateId);
        return true;
    }
}
