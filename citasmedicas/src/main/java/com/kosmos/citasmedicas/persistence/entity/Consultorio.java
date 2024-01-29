package com.kosmos.citasmedicas.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="consultorio")
public class Consultorio {

    @Id
    @Column(name="id_consultorio")
    private Integer idConsultorio;

    private String numero;
    private Integer piso;

    @OneToMany(mappedBy = "consultorio")
    private List<CitaMedica> citaMedica;

    public Integer getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(Integer idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public List<CitaMedica> getCitaMedica() {
        return citaMedica;
    }

    public void setCitaMedica(List<CitaMedica> citaMedica) {
        this.citaMedica = citaMedica;
    }
}
