package cr.ac.ucr.proyecto.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cr.ac.ucr.proyecto.models.Empleado;


@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Integer> {
	

}
