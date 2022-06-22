package cr.ac.ucr.proyecto.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cr.ac.ucr.proyecto.models.Internet;

@Repository
public interface InternetRepository extends CrudRepository<Internet, Integer> {

}
