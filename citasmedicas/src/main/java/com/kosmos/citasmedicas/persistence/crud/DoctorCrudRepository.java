package com.kosmos.citasmedicas.persistence.crud;

import com.kosmos.citasmedicas.persistence.entity.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorCrudRepository extends CrudRepository<Doctor, Integer> {
}
