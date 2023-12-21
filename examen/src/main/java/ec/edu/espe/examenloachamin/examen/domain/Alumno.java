package ec.edu.espe.examenloachamin.examen.domain;

import java.sql.Timestamp;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@Entity
@Table(name = "ALUMNO")

public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "COD_ALUMNO",nullable = false)
    private Integer codAlumno;
    @Column (name = "COD_COLEGIO",nullable = false)
    private Integer codColegio;

    @Column (name = "CEDULA",nullable = false)
    private String cedula;
    @Column (name = "NOMBRE",nullable = false)
    private String nombre;
    @Column (name = "FECHA_NACIMIENTO",nullable = false)
    private Date fechaNacimiento;
    @Column (name = "FECHA_CREACION",nullable = false)
    private Timestamp fechaCreacion;

    @ManyToOne()
    @JoinColumn(name = "COD_COLEGIO", nullable = false, updatable = false, insertable = false)
    private Colegio colegio;
}