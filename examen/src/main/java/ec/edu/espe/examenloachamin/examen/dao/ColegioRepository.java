package ec.edu.espe.examenloachamin.examen.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import ec.edu.espe.examenloachamin.examen.domain.Colegio;


@Repository
public interface ColegioRepository {
    public List<Colegio> findByCodColegioOrderByCodAColegio(Integer Colegio);
}



