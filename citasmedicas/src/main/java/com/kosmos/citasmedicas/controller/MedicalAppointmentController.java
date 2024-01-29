package com.kosmos.citasmedicas.controller;

import com.kosmos.citasmedicas.domain.model.MedicalAppointment;
import com.kosmos.citasmedicas.domain.service.MedicalAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/medicalAppointment")
public class MedicalAppointmentController {

    @Autowired
    private MedicalAppointmentService medicalAppointmentService;

    @PostMapping("/save")
    public MedicalAppointment save(@RequestBody MedicalAppointment medicalAppointment) {
        return medicalAppointmentService.save(medicalAppointment);
    }

    @DeleteMapping("/delete/{dateId}")
    public boolean delete(@PathVariable("dateId") int dateId) {
        return medicalAppointmentService.delete(dateId);
    }

    @GetMapping("/all")
    public List<MedicalAppointment> getAll() {
        return medicalAppointmentService.getAll();
    }
}
