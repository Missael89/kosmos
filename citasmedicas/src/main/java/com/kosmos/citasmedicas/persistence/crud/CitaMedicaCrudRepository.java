package com.kosmos.citasmedicas.persistence.crud;

import com.kosmos.citasmedicas.persistence.entity.CitaMedica;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface CitaMedicaCrudRepository extends CrudRepository<CitaMedica, Integer> {
    @Query(value = "DELETE FROM cita_medica WHERE id_consultorio = ? AND id_doctor = ? AND horario_consulta = ?", nativeQuery = true)
    void deleteByFilters(int idConsultorio, int idDoctor, LocalDateTime horarioConsulta);

    Optional<List<CitaMedica>> findByIdConsultorioAndIdDoctorAndHorarioConsulta(int idConsultorio, int idDoctor, LocalDateTime horarioConsulta);
}
