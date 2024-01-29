package com.kosmos.citasmedicas.controller;

import com.kosmos.citasmedicas.domain.model.Medic;
import com.kosmos.citasmedicas.domain.service.MedicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class MedicController {

    @Autowired
    private MedicService medicService;

    @GetMapping("/all")
    public List<Medic> getAll() {
        return medicService.getAll();
    }
}
