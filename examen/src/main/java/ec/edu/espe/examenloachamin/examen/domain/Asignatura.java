package ec.edu.espe.examenloachamin.examen.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "ASIGNATURA")
public class Asignatura {
    @EmbeddedId
    @Column (name = "COD_ASIGNATURA",nullable = false)
    private String codAsignatura;

    @Column (name = "NOMBRE",nullable = false)
    private String nombre;

}