package com.kosmos.citasmedicas.persistence.repository;

import com.kosmos.citasmedicas.domain.model.Medic;
import com.kosmos.citasmedicas.domain.repository.MedicRepository;
import com.kosmos.citasmedicas.persistence.crud.DoctorCrudRepository;
import com.kosmos.citasmedicas.persistence.entity.Doctor;
import com.kosmos.citasmedicas.persistence.mapper.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DoctorRepository implements MedicRepository {

    @Autowired
    private DoctorCrudRepository doctorCrudRepository;

    @Autowired
    private DoctorMapper mapper;
    @Override
    public List<Medic> getAll() {
        List<Doctor> doctors = (List<Doctor>) doctorCrudRepository.findAll();
        return mapper.toMedics(doctors);
    }
}
