package cr.ac.ucr.proyecto.models.service;

import org.springframework.data.domain.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import cr.ac.ucr.proyecto.models.Servicio;
import cr.ac.ucr.proyecto.models.repository.ServicioRepository;

@Service
public class ServicioServiceImplements implements IServicioService {

	
	@Autowired
	private ServicioRepository serviRepo;
	
	@Override
	public List<Servicio> listarTodo() {
		
		return (List<Servicio>) serviRepo.findAll();
	}

	@Override
	public void guardar(Servicio servicio) {
		
		serviRepo.save(servicio);
		
	}

	@Override
	public Servicio buscarXId(int id) {
		
		return serviRepo.findById(id).orElse(null);
	}

	@Override
	public void eliminar(int id) {
		serviRepo.deleteById(id);
		
	}

	@Override
	public Page<Servicio> getAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return serviRepo.findAll(pageable);
	}

}
