package com.kosmos.citasmedicas.domain.service;

import com.kosmos.citasmedicas.domain.model.Medic;
import com.kosmos.citasmedicas.domain.repository.MedicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicService {

    @Autowired
    private MedicRepository medicRepository;

    public List<Medic> getAll() {
        return medicRepository.getAll();
    }
}
