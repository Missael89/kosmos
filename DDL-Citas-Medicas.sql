CREATE DATABASE "kosmos-citas-medicas"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;


CREATE TABLE public.doctor
(
    id_doctor serial NOT NULL,
    nombre character varying(100) NOT NULL,
    apellido_paterno character varying(100) NOT NULL,
    apellido_materno character varying(100),
    especialidad character varying(150),
    PRIMARY KEY (id_doctor)
);


CREATE TABLE public.consultorio
(
    id_consultorio serial NOT NULL,
    numero character(2),
    piso numeric,
    PRIMARY KEY (id_consultorio)
);

CREATE TABLE public.cita_medica
(
    id_cita serial NOT NULL,
    id_consultorio integer NOT NULL,
    id_doctor integer NOT NULL,
    horario_consulta timestamp without time zone NOT NULL,
    nombre_paciente character varying NOT NULL,
    estatus boolean,
    PRIMARY KEY (id_cita),
    FOREIGN KEY (id_consultorio)
        REFERENCES public.consultorio (id_consultorio) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
FOREIGN KEY (id_doctor)
        REFERENCES public.doctor (id_doctor) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);