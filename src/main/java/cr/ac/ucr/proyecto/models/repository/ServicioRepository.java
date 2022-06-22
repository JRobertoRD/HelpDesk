package cr.ac.ucr.proyecto.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cr.ac.ucr.proyecto.models.Servicio;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Integer> {

	
}
