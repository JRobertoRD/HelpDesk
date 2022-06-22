package cr.ac.ucr.proyecto.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cr.ac.ucr.proyecto.models.Empleado;
import cr.ac.ucr.proyecto.models.repository.EmpleadoRepository;


@Service
public class EmpleadoServiceImplements implements IEmpleadoService {

	@Autowired
	private EmpleadoRepository empleRepo;
	
	@Override
	public List<Empleado> listarTodo() {
		
		return (List<Empleado>) empleRepo.findAll();
	}

	@Override
	public void guardar(Empleado empleado) {
		
		empleRepo.save(empleado); 

	}


	@Override
	public Empleado buscarXId(int id) {
		// TODO Auto-generated method stub
		return empleRepo.findById(id).orElse(null);
	}

	@Override
	public void eliminar(int id) {
		empleRepo.deleteById(id);

	}

}
