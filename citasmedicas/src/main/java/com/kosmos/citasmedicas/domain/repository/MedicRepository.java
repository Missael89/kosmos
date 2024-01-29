package com.kosmos.citasmedicas.domain.repository;

import com.kosmos.citasmedicas.domain.model.Medic;

import java.util.List;

public interface MedicRepository {
    List<Medic> getAll();
}
