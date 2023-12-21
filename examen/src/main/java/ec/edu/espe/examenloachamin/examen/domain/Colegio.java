package ec.edu.espe.examenloachamin.examen.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@Table(name = "COLEGIO")
public class Colegio {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "COD_COLEGIO",nullable = false)
    private Integer codColegio;
    @Column (name = "NOMBRE",nullable = false)
    private String nombre;
}