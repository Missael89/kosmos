package com.kosmos.citasmedicas.domain.repository;

import com.kosmos.citasmedicas.domain.model.MedicalAppointment;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface MedicalAppointmentRepository {
    MedicalAppointment save(MedicalAppointment medicalAppointment);

    void delete(int dateId);

    List<MedicalAppointment> getAll();

    Optional<List<MedicalAppointment>> getByConsultingRoomAndDoctorAndConsultationDate(int consultingRoomId, int doctorId, LocalDateTime consultationDate);
}
