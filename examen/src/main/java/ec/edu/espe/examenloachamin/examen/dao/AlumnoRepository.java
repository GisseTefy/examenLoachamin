package ec.edu.espe.examenloachamin.examen.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.examenloachamin.examen.domain.Alumno;

@Repository
public interface AlumnoRepository {
    public List<Alumno> findByCodAlumnoOrderByCodAlumno(Integer Alumno);
}



