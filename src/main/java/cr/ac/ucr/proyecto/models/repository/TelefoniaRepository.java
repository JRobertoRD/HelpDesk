package cr.ac.ucr.proyecto.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cr.ac.ucr.proyecto.models.Telefonia;

@Repository
public interface TelefoniaRepository extends CrudRepository<Telefonia, Integer> {

}
