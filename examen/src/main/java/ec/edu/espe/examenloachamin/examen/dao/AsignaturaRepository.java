package ec.edu.espe.examenloachamin.examen.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import ec.edu.espe.examenloachamin.examen.domain.Asignatura;

@Repository
public interface AsignaturaRepository {
public List<Asignatura> findByCodAsignaturaOrderByCodAsignatura(Integer Asignatura);
}

