package com.kosmos.citasmedicas.persistence.mapper;

import com.kosmos.citasmedicas.domain.model.Medic;
import com.kosmos.citasmedicas.persistence.entity.Doctor;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DoctorMapper {
    @Mappings({
            @Mapping(source = "idDoctor", target = "doctorId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellidoPaterno", target = "lastname_1"),
            @Mapping(source = "apellidoMaterno", target = "lastname_2"),
            @Mapping(source = "especialidad", target = "speciality")
    })
    Medic toMedic(Doctor doctor);

    List<Medic> toMedics(List<Doctor> doctors);

    @InheritInverseConfiguration
    Doctor toDoctor(Medic medic);
}
