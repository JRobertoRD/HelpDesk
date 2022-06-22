package cr.ac.ucr.proyecto.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cr.ac.ucr.proyecto.models.Cable;
import cr.ac.ucr.proyecto.models.repository.CableRepository;

@Service
public class CableServiceImplements implements ICableService {

	@Autowired
	private CableRepository cableRepo;
	
	@Override
	public List<Cable> listarTodo() {
		// TODO Auto-generated method stub
		return (List<Cable>) cableRepo.findAll();
	}

}
