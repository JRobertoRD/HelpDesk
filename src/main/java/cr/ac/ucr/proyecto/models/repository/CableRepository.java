package cr.ac.ucr.proyecto.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cr.ac.ucr.proyecto.models.Cable;

@Repository
public interface CableRepository extends CrudRepository<Cable, Integer> {

}
