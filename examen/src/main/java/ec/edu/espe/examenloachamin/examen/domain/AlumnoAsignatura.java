package ec.edu.espe.examenloachamin.examen.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "ALUMNO_ASIGNATURA")
public class AlumnoAsignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_ALUMNO_ASIGNATURA",nullable = false)
    private Integer codAlumnoAsignatura;
    @Column (name = "COD_ALUMNO",nullable = false)
    private Integer codAlumno;
    @Column (name = "COD_ASIGNATURA",nullable = false)
    private Integer codAsignatura;

    @Column (name = "CALIFICACION1",nullable = false)
    private Integer calificacion1;

    @Column (name = "CALIFICACION2",nullable = false)
    private Integer calificacion2;
    @Column (name = "CALIFICACION3",nullable = false)
    private Integer calificacion3;
    @Column (name = "PROMEDIO",nullable = false)
    private Integer promedio;
    @Column (name = "ESTADO",nullable = false)
    private String estado;

    @ManyToOne()
    @JoinColumn(name = "COD_ALUMNO", updatable = false, insertable = false)
    private Alumno alumno;
    @ManyToOne()
    @JoinColumn(name = "COD_ASIGNATURA", updatable = false, insertable = false)
    private Asignatura asignatura;

}