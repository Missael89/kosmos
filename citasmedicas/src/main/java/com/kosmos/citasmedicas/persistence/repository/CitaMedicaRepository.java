package com.kosmos.citasmedicas.persistence.repository;

import com.kosmos.citasmedicas.domain.model.MedicalAppointment;
import com.kosmos.citasmedicas.domain.repository.MedicalAppointmentRepository;
import com.kosmos.citasmedicas.persistence.crud.CitaMedicaCrudRepository;
import com.kosmos.citasmedicas.persistence.entity.CitaMedica;
import com.kosmos.citasmedicas.persistence.mapper.CitaMedicaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public class CitaMedicaRepository implements MedicalAppointmentRepository {

    @Autowired
    private CitaMedicaCrudRepository citaMedicaCrudRepository;
    @Autowired
    private CitaMedicaMapper mapper;

    @Override
    public MedicalAppointment save(MedicalAppointment medicalAppointment) {
        CitaMedica citaMedica = mapper.toCitaMedica(medicalAppointment);
        return mapper.toMedicalAppointment(citaMedicaCrudRepository.save(citaMedica));
    }

    @Override
    public void delete(int dateId) {
        citaMedicaCrudRepository.deleteById(dateId);
    }

    @Override
    public List<MedicalAppointment> getAll() {
        List<CitaMedica> citaMedicas = (List<CitaMedica>) citaMedicaCrudRepository.findAll();
        return mapper.toMedicalAppointments(citaMedicas);
    }

    @Override
    public Optional<List<MedicalAppointment>> getByConsultingRoomAndDoctorAndConsultationDate(int consultingRoomId, int doctorId, LocalDateTime consultationDate) {
        Optional<List<CitaMedica>> citaMedicas = citaMedicaCrudRepository.findByIdConsultorioAndIdDoctorAndHorarioConsulta(consultingRoomId, doctorId, consultationDate);
        return citaMedicas.map(items -> mapper.toMedicalAppointments(items));
    }
}
