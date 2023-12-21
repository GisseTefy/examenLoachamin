package ec.edu.espe.examenloachamin.examen.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.examenloachamin.examen.domain.Alumno;
import ec.edu.espe.examenloachamin.examen.domain.AlumnoAsignatura;
import ec.edu.espe.examenloachamin.examen.domain.Asignatura;

@Repository
public interface AlumnoAsignaturaRepository extends CrudRepository<Alumno, Asignatura> {
public List<AlumnoAsignatura> findByCodAlumnoOrderByCodAlumno(Integer Alumno);
public List<AlumnoAsignatura> findByCodAsignaturaOrderByCodAsigantura(Integer Asignatura);
}


