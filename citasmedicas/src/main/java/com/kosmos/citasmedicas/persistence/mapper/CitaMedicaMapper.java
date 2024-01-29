package com.kosmos.citasmedicas.persistence.mapper;

import com.kosmos.citasmedicas.domain.model.MedicalAppointment;
import com.kosmos.citasmedicas.persistence.entity.CitaMedica;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DoctorMapper.class})
public interface CitaMedicaMapper {
    @Mappings({
            @Mapping(source = "idCita", target = "dateId"),
            @Mapping(source = "idConsultorio", target = "consultingRoomId"),
            @Mapping(source = "idDoctor", target = "doctorId"),
            @Mapping(source = "horarioConsulta", target = "consultationDate"),
            @Mapping(source = "nombrePaciente", target = "patientFullName"),
            @Mapping(source = "estatus", target = "status")

    })
    MedicalAppointment toMedicalAppointment(CitaMedica citaMedica);

    List<MedicalAppointment> toMedicalAppointments(List<CitaMedica> citasMedicas);

    @InheritInverseConfiguration
    CitaMedica toCitaMedica(MedicalAppointment medicalAppointment);
}
